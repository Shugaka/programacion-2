package impl;

import api.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA {

    int[] vector;
    int indice;
    int[] vectorPrioridad;

    public void InicializarCola() {
        vector = new int[10];
        indice = 0;
        vectorPrioridad = new int[10];
    }

    public void AcolarConPrioridad(int x, int prioridad) {
        int j = indice;
        for ( ; j>0 && vectorPrioridad[j-1] >= prioridad ; j--) {
            vector[j] = vector[j-1];
            vectorPrioridad[j] = vectorPrioridad[j-1];
        }
        vector[j] = x;
        vectorPrioridad[j] = prioridad;
        indice++;


    }

    public void Desacolar() {
        indice--;

    }

    public int Primero() {
        return (vector[0]);

    }

    public boolean ColaVacia() {
        return (indice == 0);
   
    }

    public int Prioridad() {
    return (vectorPrioridad[0]);

    }
    
}

