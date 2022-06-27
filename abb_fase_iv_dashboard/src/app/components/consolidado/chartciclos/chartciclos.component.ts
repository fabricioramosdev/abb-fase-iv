import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-chartciclos',
  templateUrl: './chartciclos.component.html',
  styleUrls: ['./chartciclos.component.css']
})
export class ChartciclosComponent implements OnInit {

  public charts: { title, type, data, columnNames, options, width, height }[];
  @Input() loadCharts: boolean;
  @Input() displayQtdciclos: boolean;

  constructor(private router: Router, private route: ActivatedRoute,private _location: Location) { }

  ngOnInit() {
    this.loadGraficos();
    this.displayQtdciclos = true;
  }

  public chartEx1() {
    let dataPoints = [] as { y: number, label: string }[];
    dataPoints.push({ y: 15, label: '1' });
    dataPoints.push({ y: 70, label: '2' });
    dataPoints.push({ y: 8, label: '3' });
    dataPoints.push({ y: 2, label: '4' });
    dataPoints.push({ y: 10, label: '5' });

    let chart = {
      title: 'Quantidade de Ciclos',
      type: 'PieChart',
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
    
  }

  protected voltarPagina(): void {
    this._location.back();
  }

}
