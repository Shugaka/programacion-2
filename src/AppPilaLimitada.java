import api.PilaLimitadaTDA;
import impl.PilaLimitadaEstatica;
import java.util.Scanner;

public class AppPilaLimitada {
    public static void main(String[] args) throws Exception {
        PilaLimitadaTDA p1 = new PilaLimitadaEstatica();

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo para el tamaño de la pila: ");
        int tamaño = scanner.nextInt();
        while (tamaño < 0){
            System.out.print("Ingresa un número entero positivo para el tamaño de la pila: ");
            tamaño = scanner.nextInt();
        }
        scanner.close();

        p1.InicializarPila(tamaño);

        for(int i = 0; i <= 10; i++) {
            p1.Apilar(i);
        }

        while (!p1.PilaVacia()) {
            System.out.println(p1.Tope());
            p1.Desapilar();
        }
    }
}


