package api;

public interface ConjuntoTXTTDA {

    void InicializarConjunto();
    boolean ConjuntoVacio();
    void Agregar(String x);
    String Elegir();
    void Sacar(String x);
    boolean Pertenece(String x);
}
