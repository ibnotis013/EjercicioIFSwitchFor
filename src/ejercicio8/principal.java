package ejercicio8;

import java.util.Scanner;

public class principal {
    static void main() {

        Scanner sc = new Scanner(System.in);

        boolean entrada = false;

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
                            System.out.println(" Altura: 4,5 m\n" +
                                    " Peso: 750,0 kg\n" +
                                    " Sexo: Desconocido\n" +
                                    " Categoría: Renegado\n" +
                                    " Habilidad: Presión");
                            break;

                        case "arceus":
                            System.out.println(" Altura: 3,2 m\n" +
                                    " Peso: 320,0 kg\n" +
                                    " Sexo: Desconocido\n" +
                                    " Categoría: Alfa\n" +
                                    " Habilidad: Multitipo");
                            break;

                        case "deoxys":
                            System.out.println(" Altura: 1,7 m\n" +
                                    " Peso: 60,8 kg\n" +
                                    " Sexo: Desconocido\n" +
                                    "Categoría: ADN\n" +
                                    "Habilidad: Presión");
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
                    entrada = true;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA, POR FAVOR ELIGE DE NUEVO");
            }
        }while (!entrada);


    }
}
