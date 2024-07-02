import java.util.HashMap;
import java.util.Map;

public class GestorDeTareas {
    private Map<String, Tarea> tareas;
    private DiccionarioMultiple<String, String> tareasPorResponsable;
    private DiccionarioMultiple<Integer, String> tareasPorPrioridad;

    public GestorDeTareas() {
        tareas = new HashMap<>();
        tareasPorResponsable = new DiccionarioMultiple<>();
        tareasPorPrioridad = new DiccionarioMultiple<>();
    }

    public void inicializar() {
        tareas.clear();
        tareasPorResponsable = new DiccionarioMultiple<>();
        tareasPorPrioridad = new DiccionarioMultiple<>();
    }

    public void agregarTarea(String id, String descripcion, String responsable, int prioridad) {
        Tarea tarea = new Tarea(id, descripcion, responsable, prioridad);
        tareas.put(id, tarea);
        tareasPorResponsable.agregar(responsable, id);
        tareasPorPrioridad.agregar(prioridad, id);
    }

    public void eliminarTarea(String id) {
        if (tareas.containsKey(id)) {
            Tarea tarea = tareas.remove(id);
            tareasPorResponsable.obtener(tarea.getResponsable()).remove(id);
            tareasPorPrioridad.obtener(tarea.getPrioridad()).remove(id);
        }
    }

    public void actualizarDescripcion(String id, String nuevaDescripcion) {
        if (tareas.containsKey(id)) {
            Tarea tarea = tareas.get(id);
            tarea.setDescripcion(nuevaDescripcion);
        }
    }

    public void actualizarResponsable(String id, String nuevoResponsable) {
        if (tareas.containsKey(id)) {
            Tarea tarea = tareas.get(id);
            String antiguoResponsable = tarea.getResponsable();
            tarea.setResponsable(nuevoResponsable);
            tareasPorResponsable.obtener(antiguoResponsable).remove(id);
            tareasPorResponsable.agregar(nuevoResponsable, id);
        }
    }

    public void actualizarPrioridad(String id, int nuevaPrioridad) {
        if (tareas.containsKey(id)) {
            Tarea tarea = tareas.get(id);
            int antiguaPrioridad = tarea.getPrioridad();
            tarea.setPrioridad(nuevaPrioridad);
            tareasPorPrioridad.obtener(antiguaPrioridad).remove(id);
            tareasPorPrioridad.agregar(nuevaPrioridad, id);
        }
    }

    public Tarea obtenerTarea(String id) {
        return tareas.get(id);
    }

    public PilaTDA<Tarea> listaDeTareas() {
        Pila<Tarea> pilaTareas = new Pila<>();
        for (Tarea tarea : tareas.values()) {
            pilaTareas.apilar(tarea);
        }
        return pilaTareas;
    }

    public ColaTDA<Tarea> tareasPorResponsable(String responsable) {
        Cola<Tarea> colaTareas = new Cola<>();
        for (String id : tareasPorResponsable.obtener(responsable)) {
            colaTareas.encolar(tareas.get(id));
        }
        return colaTareas;
    }

    public ColaTDA<Tarea> tareasPorPrioridad(int prioridad) {
        Cola<Tarea> colaTareas = new Cola<>();
        for (String id : tareasPorPrioridad.obtener(prioridad)) {
            colaTareas.encolar(tareas.get(id));
        }
        return colaTareas;
    }

    public DiccionarioMultipleTDA<String, String> listarPorResponsable() {
        return tareasPorResponsable;
    }

    public DiccionarioMultipleTDA<Integer, String> listarPorPrioridad() {
        return tareasPorPrioridad;
    }

    class Tarea {
        private String id;
        private String descripcion;
        private String responsable;
        private int prioridad;

        public Tarea(String id, String descripcion, String responsable, int prioridad) {
            this.id = id;
            this.descripcion = descripcion;
            this.responsable = responsable;
            this.prioridad = prioridad;
        }

        public String getId() {
            return id;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getResponsable() {
            return responsable;
        }

        public void setResponsable(String responsable) {
            this.responsable = responsable;
        }

        public int getPrioridad() {
            return prioridad;
        }

        public void setPrioridad(int prioridad) {
            this.prioridad = prioridad;
        }
    }
}
