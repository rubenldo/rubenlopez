import java.util.Scanner;
/**
 * 
 * @author Ruben
 * @version 2.0
 * @since 27/01/2018
 */
public class Aciertos {
/**
 * Primero se genera el número aleatorio,
 *  a continuación se pide al usuario que introduzca un número entero.
 *   Si el valor introducido es menor o mayor del número generado, 
 *   se proporciona un texto orientativo y continua esperando un nuevo número.
 *    En caso de acierto se anuncia el éxito, y la aplicación finaliza.
 * @param args n es el numero aleatorio, cont son los intentos que cava vez que no se acierte se suma 1
 * x es el numero introducido por el usuario, si este numero es mayor o menos que n se mostrara el mensaje de cada situacion y se sumara 1 a los intentos y volvera a empezar.
 * si x es igual a n  pasara a mostrarte el mensaje de acertado y el numero de intentos.
 * 
 */
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
