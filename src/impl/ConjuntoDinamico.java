package impl;

import api.ConjuntoTDA;

public class ConjuntoDinamico implements ConjuntoTDA{
    Nodo primero;

    public void InicializarConjunto() {
        primero = null;
    }

    public boolean ConjuntoVacio() {
        return (primero == null);
    }

    public void Agregar(int x) {
        // Aca se puede sumar un contador.
        if (!this.Pertenece(x)) {
            // Crear un Nodo Aux.
            Nodo aux = new Nodo();
            aux.info = x;
            aux.sig = primero;
            primero = aux;
        }    
    }

    public int Elegir() {
        // Utilizar un contador para generar un numero random.
        // Crear Nodo Recorrer para consultar la cantidad de elementos.
        Nodo recorrer = primero;
        int contador = 0;
        Nodo recorrerAux = primero;

        while (recorrer.sig != null) {
            recorrer = recorrer.sig;
            contador ++;
        }
        contador++;

        int ubicacion = (Math.abs((int)System.nanoTime()%contador));
        for (int i = 0; i < ubicacion; i++) {
            recorrerAux = recorrerAux.sig;
        }
        return (recorrerAux.info);
    }

    public void Sacar(int x) {
        // Recorrer el conjunto en busca del elemento (condicion: recorrer.sig.info)
        // Si es la primer posicion (primero = primero.sig;)
        // Aca se puede decrementar el contador.
        if (primero != null) {
            if (primero.info == x) {
                primero = primero.sig;
            } else {
                Nodo recorrer = primero;

                while (recorrer.sig != null && recorrer.sig.info != x) {
                    recorrer = recorrer.sig;
                }
                if (recorrer.sig.info == x){
                    recorrer.sig = recorrer.sig.sig;
                }
            }
        }
    
    }

    public boolean Pertenece(int x) {
        Nodo recorrer = primero;
        while (recorrer != null && recorrer.info != x) {
            recorrer = recorrer.sig;
        }
        return (recorrer != null);
    }
}
