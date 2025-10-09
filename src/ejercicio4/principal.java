package ejercicio4;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("bienvenido a la zona de entrenamiendo intensivo para pokemons");
        Scanner sc = new Scanner(System.in);
        System.out.println("cual es el nombre de tu pokemon");
        String nombre = sc.nextLine();
        System.out.println("cual es el nivel actual");
        int nivel = sc.nextInt();
        System.out.println("cuantos niveles quieres que tu pokemon suba");
        int niveles = sc.nextInt();
        for (int i = nivel+1; i <= nivel+niveles; i++) {
            System.out.println(nombre+" ha subido de nivel "+i);
            if (i==16 || i==36 ){
                String mensajeev= "ostras "+nombre+" esta evolucionando";
                System.out.println(mensajeev);
            }
        }
        int nivelfinal = nivel+niveles;
        System.out.println("¡¡¡¡¡¡¡¡tu pokemon a alcanzado el nivel "+nivelfinal+"!!!!!!");
    }
}
