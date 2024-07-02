package api;

public interface HeapTDA {
    void InicializarHeap();
    void Agregar(int x);
    void Sacar();
    boolean HeapVacio();
    int Primero();
}
