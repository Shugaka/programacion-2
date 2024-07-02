package impl;

import api.ConjuntoTDA;

public class ConjuntoEstatica implements ConjuntoTDA {

    int[] a;
    int cant;


    public void  InicializarConjunto() {
        a = new int [100];
        cant = 0;
    }

    public boolean ConjuntoVacio() {
        return cant == 0;
    }

    public void Agregar(int x) {
        if (!this.Pertenece(x)){
            a[cant] = x;
            cant++;
        }
    }
    
    public int Elegir() {
        return(vector[Math.abs((int)System.nanoTime()%i)]);
    }

    public void Sacar(int x) {
        int i = 0;
        while (i<cant && a[i]!=x)
        i++;

        if (i < cant) {
            a[i] = a[cant-1];
            cant--;
        }
    }

    public boolean Pertenece(int x) {
        int i = 0;
        while (i<cant && a[i]!=x)
            i++;
        return (i < cant);
    }
}
