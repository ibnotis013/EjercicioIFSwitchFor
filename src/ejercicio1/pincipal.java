package ejercicio1;

import java.util.Scanner;

public class pincipal {
    static void main() {
        System.out.println("introduce la velocidad del vehiculo (numero entero)");
        int velocidad;
        Scanner sc = new Scanner(System.in);
        velocidad = sc.nextInt();
        boolean esExcesoVelocidad = true;
        if (velocidad >120) {
            System.out.println("¡Atención! Vas a una velocidad excesiva. ¡Riesgo de multa! ");
        }else {
            System.out.println("velocidad adecuada, siga asi y conduzca con seguridad");
        }



    }
}
