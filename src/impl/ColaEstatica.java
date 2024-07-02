package impl;

import api.ColaTDA;

public class ColaEstatica {

    int[] vector;
    int indice;

    public void InicializarCola() {
        vector = new int[10];
        indice = 0;
    }

    public void Acolar(int x) {
        for ( int i = indice -1; i >=0; i--) {
            vector[i+1] = vector[i];
            vector[0] = x;
            indice++;
        }
    }

    public void Desacolar() {
        indice--;
    }

    public int Primero() {
        return (vector[indice-1]);
    }

    public boolean ColaVacia() {
        return (indice == 0);
    }
}
