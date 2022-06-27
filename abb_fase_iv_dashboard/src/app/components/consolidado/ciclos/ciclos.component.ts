import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';
import { ICiclo } from 'src/app/interfaces/ciclo.interface';
import { IPressao } from 'src/app/interfaces/pressao.interface';
import { IASaidaService } from 'src/app/services/iaSaida/iaSaida.service';
import { IStep } from 'src/app/interfaces/step.interface';

@Component({
  selector: 'app-ciclos',
  templateUrl: './ciclos.component.html',
  styleUrls: ['./ciclos.component.css']
})
export class CiclosComponent implements OnInit {
  private pressao: IPressao;
  public steps: IStep[];
  public colsStep: Array<object>;
  @Input() ciclos: ICiclo[];
  @Input() displayCiclos: boolean;
  
  constructor(private router: Router, private route: ActivatedRoute,private _location: Location, private iASaidaService: IASaidaService) { }

  ngOnInit() {
    this.pressao = this.iASaidaService.getPressaoObj();
    if(!this.pressao){
      this.router.navigate(['']);
    } else {
      this.ciclos = this.pressao.ciclos;
    }
    
    this.colsStep = [
      { field: 'tempoStep', header: 'Tempo (min))' },
      { field: 'alarmsAssoc', header: 'Alarmes Associados' }
    ];
    this.displayCiclos = true;
  }

  public onRowSelect(event: any): void {

  }

  public gotoTendencia(data): void {
    this.router.navigate(['tendencia'], { relativeTo: this.route });
  }


  protected voltarPagina(): void {
    this._location.back();
  }

}
