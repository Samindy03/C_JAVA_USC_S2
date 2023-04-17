package Operaciones;
import java.util.Scanner;
/*
*Ingrese por consola 4 números los cuales debe de hacer las operaciones
*correspondientes, a + b y c*d con sus debidas restricciones, deben de ser
*números enteros y su respuesta debe de mostrarla según sea la salida
*(Entero o decimal).
*/
public class HT5_Operaciones {
    
    public static void main(String[] args) {
        
            Scanner sn = new Scanner (System.in);
            //int opc=5;
            int a, b, c, d, res1, res2;
            
            System.out.println("*** BIENVENIDO ***");
            System.out.println("Ingrese cuatro numeros ENTEROS para operar");
  
            //obteniendo datos
        try {
            System.out.println("Valor a: "); a = sn.nextInt(); 
            System.out.println("Valor b: "); b = sn.nextInt(); 
            System.out.println("Valor c: "); c = sn.nextInt();
            System.out.println("Valor d: "); d = sn.nextInt();
            res1 = a+b;     
            res2 = c*d;
            System.out.println("---- Resultados ----");
            System.out.println("La suma de "+a+" + "+b+" es: "+res1);
            System.out.println("El producto de "+c+" * "+d+" es: "+res2);
            
        } catch(Exception ex) {
            System.out.print("Los valores ingresados no son enteros, ingrese enteros: "+ex);
        }
    }
    
}
