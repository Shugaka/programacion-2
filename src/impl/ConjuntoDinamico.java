package impl;

import api.ConjuntoTDA;

public class ConjuntoDinamico implements ConjuntoTDA {
    public void  InicializarConjunto() {
        primero = null
    }

    public boolean ConjuntoVacio() {
        return (primero == null);
    }

    public void Agregar(int x) {
        if (!this.Pertenece(x)){
            a[cant] = x;
            cant++;
        }

        Nodo aux = new Nodo();
        aux.info = x;
        aux.sig = primero;
        primero = aux;
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