import { Component, Input, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-tendencia',
  templateUrl: './tendencia.component.html',
  styleUrls: ['./tendencia.component.css']
})
export class TendenciaComponent implements OnInit {
  public charts: { title, type, data, columnNames, options, width, height }[];
  @Input() loadCharts: boolean;
  @Input() displayTendencia: boolean;

  constructor(private router: Router, private route: ActivatedRoute,private _location: Location) { }

  ngOnInit() {
    this.loadGraficos();
    this.displayTendencia = true;
  }

  public chartEx1() {
    let dataPoints = [] as { y: number, label: string }[];
    dataPoints.push({ y: 0, label: '1' });
    dataPoints.push({ y: 0, label: '2' });
    dataPoints.push({ y: 0, label: '3' });
    dataPoints.push({ y: 0, label: '4' });
    dataPoints.push({ y: 500, label: '5' });
    dataPoints.push({ y: 1000, label: '6' });
    dataPoints.push({ y: 2500, label: '7' });
    dataPoints.push({ y: 2500, label: '8' });
    dataPoints.push({ y: 2500, label: '9' });
    dataPoints.push({ y: 5000, label: '10' });
    dataPoints.push({ y: 2500, label: '11' });
    dataPoints.push({ y: 0, label: '12' });
    dataPoints.push({ y: 0, label: '13' });

    let chart = {
      title: 'Tendência de Steps',  
      type: 'LineChart',
      data: [],
      columnNames: ['Passo', 'Quantidade de Ciclos'],
      options: null,
      width: null,
      height: null
    };
    dataPoints.forEach((dp) => chart.data.push([dp.label.toString(), dp.y]));
    this.charts.push(chart);
  }

  public loadGraficos() {
    this.loadCharts = false;
    this.charts = [];
    this.chartEx1();
    this.loadCharts = true;
  }

  public onSelect(event) {
    this.router.navigate(['consolidado'], { relativeTo: this.route });
  }

  protected voltarPagina(): void {
    this._location.back();
  }


}
