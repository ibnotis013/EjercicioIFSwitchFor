package ejercicio5;

public class principal {
    public static void main(String[] args) {

        System.out.println("EMPIEZA EL COMBATE ENTRE PIKACHU Y GENGAR");

         int vidapikachu= 100;
         int vidagengar= 120;
         int ataquepikachu=55;
         int ataquegengar=50;

        for (int i = 3; i >= 0; i--) {
            vidapikachu -=ataquegengar;
            vidagengar -=ataquepikachu;
            System.out.println("turno restante "+i);
            System.out.println("Pikachu ataca a gengar, a gengar le quedan "+ vidagengar+ " puntos de vida");
            System.out.println("Gengar ataca a picachu, a pikachu le quedan "+vidapikachu+ " puntos de vida");
            System.out.println("--------------------------------------------------------------------------");
            if (vidapikachu<=0) {
                System.out.println("pikachu se ha debilitado");
                break;
            } else if (vidagengar<=0) {
                System.out.println("gengar se ha debilitado");
                break;
            }
            if (i==0){
                System.out.println("no hay mas turnos ");
            }
        }
        System.out.println("------------------------------");
        System.out.println("FIN DEL COMBATE");
        if (vidapikachu<=0) {
            System.out.println("GENGAR GANA");
        }else if (vidagengar<=0) {
            System.out.println("PIKACHU GANA");
        }else if (vidapikachu== vidagengar) {
            System.out.println("empate");
        }



    }
}
