package Factorial;
import java.util.Scanner;
/*
*Realizar un método o función la cual calcule el factorial de un número
*ingresado por el usuario.
*/
public class HT5_Numero_Factorial {

    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        int n;
        
        try{
            System.out.println("Ingrese el numero deseado para conocer su factorial; "); n = sn.nextInt();
            System.out.println("El factorial de "+n+" es: "+CalculoFactorial(n));

        } catch (Exception e) {
            System.out.println("Por favor, ingrese un número entero: " +e);
        }
    }
    public static int CalculoFactorial(int fac){    //funcion para calcular el factorial;
           int factorial = 1;
           while(fac!=0){
           factorial *= fac;
           fac -= 1;
           }
            return factorial;
            }
}
