package exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NUmero {

    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = null;

        System.out.println("O P E R A C I O N E S ");
        do {


            try {
                sc = new Scanner(System.in);
                System.out.print("Ingresa el primer  numero:");
                int x = sc.nextInt();
                System.out.println("Ingresa el segundo numero");
                int y =sc.nextInt();
                int div = x/y;
                System.out.println("la division es :" + div);
                continuar = false;

            } catch (InputMismatchException e) {
                System.out.println("ERROR:" + e.getMessage());
                System.out.println("!ingresa un numero¡");
                sc.next();

            }catch (ArithmeticException a){
                System.out.println("ERROR"+ a.getMessage());
                System.out.println(" No se puede realizar division entre 0");
            }

        } while (continuar);

    }

}
