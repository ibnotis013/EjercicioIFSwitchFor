package ejercicio6;

import java.util.Scanner;

public class principal {
    static void main() {
        String pelicula = "el club de los poetas muertos";
        String actor = "robin williams";
        Scanner sc = new Scanner(System.in);
        boolean haAdivinado=false;

        System.out.println("buenas, tienes 3 intentos para adivinar a el protagonista de la peli "+pelicula);
        for (int i=3; i>=0;i--){
            System.out.println("escribe el nombre del actor");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase(actor)){
                haAdivinado=true;
                System.out.println("felicitaciones, has adivinado el actor.");
                break;
            }else if (i==3) {
                System.out.println("fallo en el intento 1");
                System.out.println("la respuesta no es correcta, intentelo de nuevo");
                System.out.println("el actor se suicido");
            }else if (i==2){
                System.out.println("fallo en la respuesta 2");
                System.out.println("la respuesta no es correcta");
                System.out.println("el actor era uno de los mejores en el ambito de el las peliculas profindas");
            } else if (i==1) {
                System.out.println("fallo en el intento 3");
                System.out.println("la respuesta no es correcta");
                System.out.println("FIN");
                    break;

            }


        }
        if (haAdivinado==false){
            System.out.println("has perdido, el actor era robin williams");
        }
    }
}
