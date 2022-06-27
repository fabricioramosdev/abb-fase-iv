import { Component, Input, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { IIASaida } from 'src/app/interfaces/iasaida.interface';
import { IASaidaService } from 'src/app/services/iaSaida/iaSaida.service';
import { ActivatedRoute, Router } from '@angular/router';
import { IPressao } from 'src/app/interfaces/pressao.interface';
import { ICiclo } from 'src/app/interfaces/ciclo.interface';

@Component({
  selector: 'app-consolidado',
  templateUrl: './consolidado.component.html',
  styleUrls: ['./consolidado.component.css']
})
export class ConsolidadoComponent implements OnInit {
  public iasaidas: IIASaida[];
  public iasaida: IIASaida;
  public pressoes: IPressao[];
  public pressao: IPressao;
  public ciclos: ICiclo[];
  public colsConsolidado: Array<object>;
  public colsConsolidadoDet: Array<object>;
  @Input() displayConsolidado: boolean;
  @Input() displayConsolidadoDet: boolean;

  constructor(private router: Router, private route: ActivatedRoute, private _location: Location,private iASaidaService: IASaidaService) { }

  ngOnInit() {
    this.iASaidaService.getIASaidas().subscribe((res) =>{
      this.iasaidas = res;
      this.displayConsolidado = true;
    });
    this.colsConsolidado = [
      { field: 'gaveta', header: 'Gaveta' },
      { field: 'totalCiclos', header: 'Total de Ciclos' }
    ];
    this.colsConsolidadoDet = [
      { field: 'psi', header: 'Pressão (PSI)' },
      { field: 'qtdCiclos', header: 'Qtd Ciclos' },
      { field: 'tempoMedCiclo', header: 'Tempo Médio do Ciclo' },
      { field: 'tempoMaxCiclo', header: 'Maior tempo de Ciclo' }
    ];
  }

  public onRowSelect(event: any): void {
    this.gotoConsolidadoDetalhes(event.data);
  }

  public onRowSelectDet(event: any): void {
    this.gotoCiclos(event.data);
  }

  public gotoConsolidadoDetalhes(data: IIASaida): void {
    this.iasaida = data;
    this.pressoes = data.pressao;
    this.displayConsolidadoDet = true;
  }


  public gotoChartciclos(data): void {
    this.router.navigate(['qtd-ciclos'], { relativeTo: this.route });
  }

  public gotoCiclos(data: IPressao): void {
    this.pressao = data;
    this.ciclos = data.ciclos;
    this.iASaidaService.setPressaoObj(data);
    this.router.navigate(['ciclos'], { relativeTo: this.route });
  }

  protected voltarPagina(): void {
    this._location.back();
  }
}
