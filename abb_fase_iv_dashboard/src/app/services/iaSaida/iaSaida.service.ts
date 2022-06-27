import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, ReplaySubject } from 'rxjs';
import { IIASaida } from 'src/app/interfaces/iasaida.interface';
import { IPressao } from 'src/app/interfaces/pressao.interface';
import { ICiclo } from 'src/app/interfaces/ciclo.interface';
import { IStep } from 'src/app/interfaces/step.interface';

@Injectable({
  providedIn: 'root'
})
export class IASaidaService {
  private iasarr: IIASaida[];
  private pressaoObj: IPressao;

  constructor(private http: HttpClient) { }

  public getIASaidas(): Observable<IIASaida[]> {
    return this.http.get<IIASaida[]>("assets/iaresult.json");
  }

  public setIasarr(iasarr: IIASaida[]){
    this.iasarr = iasarr;
  }

  public getIasarr(): IIASaida[]{
    return this.iasarr;
  }

  public setPressaoObj(pressao: IPressao){
    this.pressaoObj = pressao;
  }

  public getPressaoObj(): IPressao{
    return this.pressaoObj;
  }

}
