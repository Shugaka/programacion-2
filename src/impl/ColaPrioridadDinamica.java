package impl;

import api.ColaPrioridadTDA;

public class ColaPrioridadDinamica implements ColaPrioridadTDA {

    NodoPr primero;
    NodoPr ultimo;

    public void InicializarCola() {
        primero = null;
        ultimo = null;
    }

    public void AcolarConPrioridad(int x, int prioridad) {

        NodoPr aux = new NodoPr();
        aux.valor = x;
        aux.prioridad = prioridad;
        aux.sig = null;
        if (primero == null) {
            primero = aux;
            ultimo = aux;
        }else{
            if (aux.prioridad > primero.prioridad) { //si la prioridad es la mayor
                aux.sig = primero;
                primero = aux;
            }
            else if(aux.prioridad < ultimo.prioridad) {
                ultimo.sig = aux;
                ultimo = aux;
            }
            else {
                NodoPr recorrer = primero;
                if (recorrer.sig == null) {
                    recorrer.sig = aux;
                }
                else{
                    while (recorrer.sig.prioridad >= aux.prioridad) {
                        recorrer = recorrer.sig;
                    }
                    aux.sig = recorrer.sig;
                    recorrer.sig = aux;    
                }
            }    
        }
    }

    public void Desacolar() {
        primero = primero.sig;
    }

    public int Primero() {
        return (primero.valor);

    }

    public boolean ColaVacia() {
        return (primero == null);
   
    }

    public int Prioridad() {
        return (primero.prioridad);

    }
    
}
