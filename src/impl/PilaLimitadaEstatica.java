package impl;

import api.PilaLimitadaTDA;

public class PilaLimitadaEstatica implements PilaLimitadaTDA {
    int [] vector;
    int i;
    int tamañoTot;

    /* public void InicializarPila() {
        vector = new int[100];
        i = 0;
    } */

    public void InicializarPila(int tamaño) {
        vector = new int[tamaño];
        i = 0;
        tamañoTot = tamaño;
    }

    /* public void Apilar(int x) {
    vector[i] = x;
    i++;
    } */

/*     public void Apilar(int x) {
        if (tamañoTot == i+1) {
            for (int j = 0; j < tamañoTot-1; j++) {
                vector[j] = vector[j+1];
            }
            vector[i] = x;
        } else {
            vector[i] = x;
            i++;
        }
    } */

    public void Apilar(int x) {
        if (i == tamañoTot) {
            for (int j = 0; j < tamañoTot - 1; j++) {
                vector[j] = vector[j + 1];
            }
            vector[tamañoTot - 1] = x; 
        } else {
            vector[i] = x;
            i++; 
        }
    }
    

    public void Desapilar() {
        i--;
    }

    public int Tope(){
        return (vector[i-1]);
    }
    
    public boolean PilaVacia() {
        return (i == 0);
    }
}
