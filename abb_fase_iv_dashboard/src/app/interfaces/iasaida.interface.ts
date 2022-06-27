import { IPressao } from "./pressao.interface";

export interface IIASaida {
    gaveta: string;
    totalCiclos: number;
    pressao: IPressao[];
}
