
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] sectores = new int[10];

        int suma = 0;
        int mayor;
        int posicionMayor = 0;

        
        for (int i = 0; i < sectores.length; i++) {

            System.out.print("Digite el consumo del sector " + (i + 1) + ": ");
            sectores[i] = teclado.nextInt();

            while (sectores[i] < 0) {
                System.out.println("El consumo no puede ser negativo.");
                System.out.print("Digite nuevamente el consumo: ");
                sectores[i] = teclado.nextInt();
            }

            suma = suma + sectores[i];
        }

        
        mayor = sectores[0];

        for (int i = 1; i < sectores.length; i++) {

            if (sectores[i] > mayor) {
                mayor = sectores[i];
                posicionMayor = i;
            }
        }

        
        double promedio = suma / 10.0;

        
        int cantidad = 0;

        for (int i = 0; i < sectores.length; i++) {

            if (sectores[i] > promedio) {
                cantidad++;
            }
        }

        
        int racha = 0;
        int rachaMaxima = 0;

        for (int i = 0; i < sectores.length; i++) {

            if (sectores[i] > promedio) {
                racha++;

                if (racha > rachaMaxima) {
                    rachaMaxima = racha;
                }

            } else {
                racha = 0;
            }
        }

        
        System.out.println("RESULTADOS ");
        System.out.println("Consumo total: " + suma + " m3");
        System.out.println("Promedio: " + promedio + " m3");
        System.out.println("Sector con mayor consumo: " + (posicionMayor + 1));
        System.out.println("Mayor consumo: " + mayor + " m3");
        System.out.println("Sectores sobre el promedio: " + cantidad);
        System.out.println("Racha más larga: " + rachaMaxima);

        
        System.out.println("CONSUMO POR SECTOR ");

        for (int i = 0; i < sectores.length; i++) {
            System.out.println("Sector " + (i + 1) + ": "
                    + sectores[i] + " m3");
        }

        teclado.close();
    }
}

