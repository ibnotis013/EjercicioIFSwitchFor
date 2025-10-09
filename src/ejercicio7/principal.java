package ejercicio7;

public class principal {
    static void main() {
        System.out.println("COMIENZA LA CARRERA DEL SIGLO!!!!!!!!!!!!!!!!!!");
    String coche1 = "muscle car";
    String coche2 = "deportivo japones";
    double velocidadinicial1 = 0.0;
    double aceleracion1 = 1.3;
    double velocidadinicial2 = 0.0;
    double aceleracion2 = 1.0;
    double distancia1 = 0.0;
    double distancia2 = 0.0;
    double velocidadnueva1 = 0.0;
    double velocidadnueva2 = 0.0;
    double distancianueva1 = 0.0;
    double distancianueva2 = 0.0;

    for (int i = 1;i<=15;i++) {
       velocidadnueva1 += velocidadinicial1 + aceleracion1;
       distancianueva1 += distancia1 + velocidadnueva1;
        velocidadnueva2 += velocidadinicial2 + aceleracion2;
        distancianueva2 += distancia2 + velocidadnueva2;
        System.out.println("segundo "+i+" y " +coche1+ " ha recorrido "+distancianueva1+" metros |  " +coche2+ " ha recorrido "+distancianueva2+" metros" );

        if (distancianueva1>=400 || distancianueva2>=400) {
            System.out.println(coche1+" HA CRUZADO LA META ");
            System.out.println(coche2+" HA CRUZADO LA META ");
            if (distancianueva1>distancianueva2) {
                System.out.println("el "+coche1+" es el ganador");
                break;
            }else if (distancianueva2>distancianueva1) {
                System.out.println("el " +coche2+" es el ganador");
                break;
            }

        }
        if (i==15){
            System.out.println("El tiempo se ha acabado,");
            if (distancianueva1>distancianueva2) {
                System.out.println("el "+coche1+" es el ganador");
            }else if (distancianueva2>distancianueva1) {
                System.out.println("el "+coche2+" es el ganador");
            }
        }
    }



    }
}
