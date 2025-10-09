package ejercicio8;

import java.util.Scanner;

public class principal {
    static void main() {

        Scanner sc = new Scanner(System.in);

        String entrada = "3";

        do {
            System.out.println("--------------------------");
            System.out.println("POKEDEX INTERACRIVA\n" +
                    "1. Buscar Pokémon por nombre\n" +
                    "2. Comparar estadísticas de Pokémon\n" +
                    "3. Salir\n" +
                    "Elige una opción:\n");
            System.out.println("-------------------------------------");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("introduzca el nombre del pokemon");
                    String nombre = sc.nextLine();
                    switch (nombre) {
                        case "giratina":
                            System.out.println("Altura4,5 m\n" +
                                    "Peso750,0 kg\n" +
                                    "SexoDesconocido\n" +
                                    "CategoríaRenegado\n" +
                                    "Habilidad\n" +
                                    "Presión");
                            break;

                        case "arceus":
                            System.out.println("3,2 m\n" +
                                    "Peso320,0 kg\n" +
                                    "SexoDesconocido\n" +
                                    "CategoríaAlfa\n" +
                                    "Habilidad\n" +
                                    "Multitipo");
                            break;

                        case "deoxys":
                            System.out.println("Altura1,7 m\n" +
                                    "Peso60,8 kg\n" +
                                    "SexoDesconocido\n" +
                                    "CategoríaADN\n" +
                                    "Habilidad\n" +
                                    "Presión");
                            break;

                        default:
                            System.out.println("POKEMON NO ENCONTRADO");
                            }
                    break;
                case "2":
                    System.out.println("comparar estadisticas");
                    int ataqueGiratina = 200;
                    int ataquearceus = 150;
                    int defensaGiratina = 300;
                    int defensaarceus = 430;
                    if (ataqueGiratina > ataquearceus) {
                        System.out.println("ataque de giratina "+ataqueGiratina+ " es mas potente que el de arceus " +ataquearceus);
                    }
                    if (defensaarceus > defensaGiratina) {
                        System.out.println("la defensa de arceus "+defensaarceus+ " es mas dura que la defensa de giratina "+defensaGiratina);
                    }
                    break;

                case "3":
                    System.out.println("SALIENDO DE LA POKEDEX");
                    break;

                default:
                    System.out.println("OPCION NO VALIDA, POR FAVOR ELIGE DE NUEVO");
            }
        }while ();


    }
}
