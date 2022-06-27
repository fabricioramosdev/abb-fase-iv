import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders } from '@angular/compiler/src/core';
import { PagenotfoundComponent } from './components/security/pagenotfound/pagenotfound.component';
import { ConsolidadoComponent } from './components/consolidado/consolidado.component';
import { AppComponent } from './app.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { CiclosComponent } from './components/consolidado/ciclos/ciclos.component';
import { TendenciaComponent } from './components/consolidado/ciclos/tendencia/tendencia.component';
import { ChartciclosComponent } from './components/consolidado/chartciclos/chartciclos.component';


const ROUTES: Routes = [
    {
        path: '', component: HomepageComponent, children: [
            { path: 'consolidado', component: ConsolidadoComponent, children: [
                { path: 'ciclos', component: CiclosComponent, children: [
                    { path: 'tendencia', component: TendenciaComponent }
                ] },
                { path: 'qtd-ciclos', component: ChartciclosComponent }
            ] }
        ]
    },

    { path: '**', component: PagenotfoundComponent }
];
export const routing: ModuleWithProviders = RouterModule.forRoot(ROUTES);


@NgModule({
    declarations: [],
    imports: [RouterModule.forRoot(ROUTES, { useHash: true })],
    exports: [RouterModule]
})
export class AppRoutingModule { }