import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule} from '@angular/forms';


import {TableModule} from 'primeng/table';
import {ToastModule} from 'primeng/toast';
import {CalendarModule} from 'primeng/calendar';
import {SliderModule} from 'primeng/slider';
import {MultiSelectModule} from 'primeng/multiselect';
import {ContextMenuModule} from 'primeng/contextmenu';
import {DialogModule} from 'primeng/dialog';
import {ButtonModule} from 'primeng/button';
import {DropdownModule} from 'primeng/dropdown';
import {ProgressBarModule} from 'primeng/progressbar';
import {InputTextModule} from 'primeng/inputtext';
import {RatingModule} from 'primeng/rating';

import { AppComponent } from './app.component';

import { GoogleChartsModule } from 'ng8-google-chart';
import { ConsolidadoComponent } from './components/consolidado/consolidado.component';
import { PagenotfoundComponent } from './components/security/pagenotfound/pagenotfound.component';
import { AppRoutingModule } from './app.routing.module';
import { HomepageComponent } from './components/homepage/homepage.component';
import { CiclosComponent } from './components/consolidado/ciclos/ciclos.component';
import { TendenciaComponent } from './components/consolidado/ciclos/tendencia/tendencia.component';
import { ChartciclosComponent } from './components/consolidado/chartciclos/chartciclos.component';

@NgModule({
  declarations: [
    AppComponent,
    ConsolidadoComponent,
    PagenotfoundComponent,
    HomepageComponent,
    CiclosComponent,
    TendenciaComponent,
    ChartciclosComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RouterModule,
    AppRoutingModule,
    BrowserModule,
    TableModule,
    CalendarModule,
		SliderModule,
		DialogModule,
		MultiSelectModule,
		ContextMenuModule,
		DropdownModule,
		ButtonModule,
		ToastModule,
    InputTextModule,
    ProgressBarModule,
    HttpClientModule,
    FormsModule,
    RatingModule,
    GoogleChartsModule.forRoot(),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
