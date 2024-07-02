package api;

public interface GestorDeReservaTDA {
    void inicializar();
    void agregarReserva(int id, int vuelo, int asiento, String fecha);
    void eliminarReserva(int id);
    void actualizarAsiento(int id, int asiento);
    void actualizarVuelo(int id, int vuelo);
    void actualizarFecha(int id, String fecha);
    String obtenerReserva(int id);
    PilaTDA listaDeReservas();
    ColaTDA reservasPorVuelo(int vuelo);
    ConjuntoTDA reservasPorFecha(String fecha);
}
