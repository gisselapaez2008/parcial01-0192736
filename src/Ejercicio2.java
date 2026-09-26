
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[4][5];

        
        for (int fila = 0; fila < 4; fila++) {

            for (int columna = 0; columna < 5; columna++) {

                System.out.print("Producción de la máquina "
                        + (fila + 1) + " del día "
                        + (columna + 1) + ": ");

                matriz[fila][columna] = teclado.nextInt();

                while (matriz[fila][columna] < 0) {

                    System.out.println("No puede ingresar un número negativo.");

                    System.out.print("Ingrese nuevamente la producción: ");
                    matriz[fila][columna] = teclado.nextInt();
                }
            }
        }

        
        int mayor = 0;
        int maquina = 1;

        System.out.println("\n===== TOTAL POR MÁQUINA =====");

        for (int fila = 0; fila < 4; fila++) {

            int total = 0;

            for (int columna = 0; columna < 5; columna++) {
                total = total + matriz[fila][columna];
            }

            System.out.println("Máquina " + (fila + 1)
                    + ": " + total + " piezas");

            if (fila == 0) {
                mayor = total;
            }

            if (total > mayor) {
                mayor = total;
                maquina = fila + 1;
            }
        }

        
        int menor = 0;
        int dia = 1;

        System.out.println("\n===== TOTAL POR DÍA =====");

        for (int columna = 0; columna < 5; columna++) {

            int totalDia = 0;

            for (int fila = 0; fila < 4; fila++) {
                totalDia = totalDia + matriz[fila][columna];
            }

            System.out.println("Día " + (columna + 1)
                    + ": " + totalDia + " piezas");

            if (columna == 0) {
                menor = totalDia;
            }

            if (totalDia < menor) {
                menor = totalDia;
                dia = columna + 1;
            }
        }

        
        int menores = 0;

        for (int fila = 0; fila < 4; fila++) {

            for (int columna = 0; columna < 5; columna++) {

                if (matriz[fila][columna] < 20) {
                    menores++;
                }
            }
        }

        
        System.out.println(" RESULTADOS FINALES");

        System.out.println("Máquina con mayor producción: "
                + maquina);

        System.out.println("Producción de esa máquina: "
                + mayor + " piezas");

        System.out.println("Día con menor producción: "
                + dia);

        System.out.println("Producción de ese día: "
                + menor + " piezas");

        System.out.println("Registros menores de 20 piezas: "
                + menores);

        
        System.out.println("\n===== MATRIZ =====");

        for (int fila = 0; fila < 4; fila++) {

            System.out.print("Máquina " + (fila + 1) + ": ");

            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }

            System.out.println();
        }

        teclado.close();
    }
}


 