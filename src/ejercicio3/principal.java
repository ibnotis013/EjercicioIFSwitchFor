package ejercicio3;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("elige un director");
        System.out.println("Christopher Nolan");
        System.out.println("Quentin Tarantino");
        System.out.println("Guillermo del Toro");
        Scanner sc = new Scanner(System.in);
        String director = sc.nextLine();
        switch (director)
            {
            case "Christopher Nolan":
                System.out.println("te recomiendo INCEPTION, te gustan las pelis de ciencia ficcicon");
                String respuesta = sc.nextLine();
                if (respuesta.equals("si")){
                    System.out.println("genial disfrutaras de sus mundos complejos");
                }else if (respuesta.equals("no")) {
                    System.out.println("quizas te mole la peli the dark knight, que es mas de accion");
                }else{
                    System.out.println("respuesta erronea plas ");
                }
            break;
            case "Guillermo del Toro":
                System.out.println("te recomientdo el laberiento del fauno, te gustan las pelis de fantasia oscura ?");
                String repuesta = sc.nextLine();
                if (repuesta.equals("si")){
                    System.out.println("te sumergiras en un mundo magico e inolvidable");
                }else if  (repuesta.equals("no")) {
                    System.out.println("puedes probar con pacific rim para una dosis de accion con moustros gigantes");
                }else {
                    System.out.println("respuesta erronea plas ");
                }
            break;
                case "Quentin Tarantino":
                System.out.println(" te recomiendo pulp fiction, te gustan los dialogos ingeniosos?");
                String respuestas = sc.nextLine();
                if (respuestas.equals("si")){
                    System.out.println("perfecto, te encantara el guion");
                }else if (respuestas.equals("no")){
                    System.out.println("no te preocupes, la accion y la trama tambien son excelentes");
                }else  {
                    System.out.println("respuesta erronea plas ");
                }
            break;
                default:
                    System.out.println("director no encontrado en la base de datos");

            }



    }
}
