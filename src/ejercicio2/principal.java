package ejercicio2;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("introduce el nombre del jugador");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("introduzca el numero de partidos del  el jugador");
        double numeroPartidos = sc.nextDouble();
        System.out.println("introdice el numero de goles de el jugador");
        double numeroGoles = sc.nextDouble();


if (numeroPartidos >=1) {
    double promedio = (numeroGoles/numeroPartidos);
        if (promedio >= 0.8) {
            System.out.println("se llama "+nombre);
            System.out.printf( " tiene un promedio de %1.2f", + promedio);
            System.out.println(" rendimiento de bota de oro");
        } else if (promedio >=0.5) {
            System.out.println("se llama "+nombre);
            System.out.printf( " tiene un promedio de %1.2f", + promedio);
            System.out.println("muy buen rendimiento, es un gran jugador");
        }else if (promedio < 0.5) {
            System.out.println("se llama "+nombre);
            System.out.printf( " tiene un promedio de %1.2f", + promedio);
            System.out.println("necesita mejorar tu promedio, sigue trabajando ");
        }
}else{
    System.out.println("no se puede evaluar el rendimiento sin haber jugado partidos");
}


    }

}
