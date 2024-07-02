package api;

public interface PilaLimitadaTDA {
    void InicializarPila(int tamaño);
    void Apilar(int x);
    void Desapilar();
    int Tope();
    boolean PilaVacia();
}
