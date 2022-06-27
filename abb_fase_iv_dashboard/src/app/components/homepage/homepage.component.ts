import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  public charts: { title, type, data, columnNames, options, width, height }[];
  @Input() loadCharts: boolean;

  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit() {
    this.loadGraficos();
    
  }


  public chartEx1() {
    let dataPoints = [] as { y: number, label: string }[];
    dataPoints.push({ y: 10, label: '1' });
    dataPoints.push({ y: 10, label: '2' });
    dataPoints.push({ y: 10, label: '3' });
    dataPoints.push({ y: 50, label: '4' });
    dataPoints.push({ y: 500, label: '5' });
    dataPoints.push({ y: 1000, label: '6' });
    dataPoints.push({ y: 2500, label: '7' });
    dataPoints.push({ y: 2500, label: '8' });
    dataPoints.push({ y: 2500, label: '9' });
    dataPoints.push({ y: 5000, label: '10' });
    dataPoints.push({ y: 2500, label: '11' });
    dataPoints.push({ y: 10, label: '12' });
    dataPoints.push({ y: 10, label: '13' });

    let chart = {
      title: 'Pressão Ciclo Corrente',
      type: 'LineChart',
      data: [],
      columnNames: ['Ponto', 'Valor'],
      options: null,
      width: null,
      height: null
    };
    dataPoints.forEach((dp) => chart.data.push([dp.label.toString(), dp.y]));
    this.charts.push(chart);
  }

  public chartEx2() {
    let dataPoints = [] as { y: number[], label: string }[];
    dataPoints.push({ y: [100,80], label: 'Dia 12' });
    dataPoints.push({ y: [105,90], label: 'Dia 13' });
    dataPoints.push({ y: [90,120], label: 'Dia 14' });
    dataPoints.push({ y: [75,110], label: 'Dia 15' });
    dataPoints.push({ y: [115,100], label: 'Dia 16' });
    dataPoints.push({ y: [95,120], label: 'Dia 17' });
    dataPoints.push({ y: [40,35], label: 'Dia Corrente' });

    let chart = {
      title: 'Quantidade de Ciclos',
      type: 'ColumnChart',
      data: [],
      columnNames: ['Dia', 'Gaveta A','Gaveta B'],
      options: {isStacked: true},
      width: null,
      height: null
    };
    
    dataPoints.forEach((dp) => chart.data.push([dp.label.toString(), dp.y[0],dp.y[1]]));
    this.charts.push(chart);
  }

  public chartEx3() {
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

  public chartEx4() {
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
    this.chartEx2();
    this.loadCharts = true;
  }

  public onSelect(event) {
    this.router.navigate(['consolidado'], { relativeTo: this.route });
  }


}
