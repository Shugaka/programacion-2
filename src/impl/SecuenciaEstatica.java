package impl;

import api.SecuenciaTDA;

// secuencia seria una cadena de letra/numeros que se pueden repetir ,

public class SecuenciaEstatica implements SecuenciaTDA {
    int [] a;
    int p; //position
    int ntotal; //n totales en la secuencia

    public void InicializarSecuencia(); {
        a = new int[20];
        l = 0; //length
        ntotal = 0;
    }

    public void AgregarEnPos(int x, int p); { 
        a[p] = x;
    } //agarrar en la posición o en el ultimo, no puede dejar espacios libres, o pisa 

    public void AgregarAlInicio(int x); {
        a[0] = x;
    } //inserta el número en la primer posición

    public void AgregarAlFinal(int x); {
        a[ntotal] = x;
    } //agrega en la ultima posición

    public void InsertarEnPos(int x, int p); {
        int j = 0
        for (int i = ntotal; i >= p; i--)
            a[(ntotal-j)+1] = a[ntotal-j]
            j++;
        a [p] = x;
        l++;
    } //inserta

    public void EliminarPos(int p); {} //lo mismo que insertar pero alrevez

    public void EliminarTodosValor(int x); {} //elimina todos los valores x de la secuencia

    public void Ordenar(); {
        sort(a)
    }

    public void Mostrar(); {} //muestra la secuencia en pantalla
    
    void EliminarRepetidos(); {}

    public boolean SecuenciaVacia(); {}
}
