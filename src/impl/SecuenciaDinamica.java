package impl;

import api.SecuenciaTDA;

public class SecuenciaDinamica implements SecuenciaTDA {
    public void InicializarSecuencia(); {}
    public void AgregarEnPos(int x, int p); {} //agarrar en la posición o en el ultimo, no puede dejar espacios libres, o pisa
    public void AgregarAlInicio(int x); {} //inserta el número en la primer posición
    public void AgregarAlFinal(int x); {} //agrega en la ultima posición
    public void InsertarEnPos(int x, int p); {} //inserta
    public void EliminarPos(int p); {}
    public void EliminarTodosValor(int x); {} //elimina todos los valores x de la secuencia
    public void Ordenar(); {}
    public void Mostrar(); {} //muestra la secuencia en pantalla
    public boolean SecuenciaVacia(); {}
}
