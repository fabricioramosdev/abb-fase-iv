import { ICiclo } from "./ciclo.interface";

export interface IPressao {
    psi: number;
    qtdCiclos: number;
    tempoMedCiclo: string;
    tempoMaxCiclo: string;
    cicloMax: ICiclo;
    ciclos: ICiclo[];
}
