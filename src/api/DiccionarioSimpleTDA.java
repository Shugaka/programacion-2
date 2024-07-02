package api;

public interface DiccionarioSimpleTDA {
    void InicializarDiccionar();
    void Agregar(int clave, int valor);
    void Eliminar(int clave);
    int Recuperar(int clave);
    ConjuntoTDA Claves();
}
