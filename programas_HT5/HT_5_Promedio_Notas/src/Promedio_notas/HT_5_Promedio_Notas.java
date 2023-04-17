/*
 * El usuario debe de ingresar sus notas de un semestre, esto quiere decir que
debe de ingresar la notas de los 4 parciales, con esto se debe de sacar el
promedio de la clase, pero OJO que las primeras 2 notas cuentan con el 20%
de la nota final del curso y una nota de ella cuenta el 30%. Teniendo en
cuenta esto debe de mostrar en consola si ha aprobado el curso con un
promedio Excelente (85 - 100), Muy bueno (80 - 84), Bueno (70 - 79), Regular
(60 - 69) o repite curso (< 59).
 *
 */
package Promedio_notas;
import java.util.Scanner;
public class HT_5_Promedio_Notas {

    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        Double nota1, nota2, nota3, nota4, promedio;
        try{
        System.out.println("Ingrese las notas de parcial del semestre");
        System.out.println("Nota del primer parcial"); nota1 = sn.nextDouble()*0.2;
        System.out.println("Nota del segundo parcial"); nota2 = sn.nextDouble() *0.2;
        System.out.println("Nota del tercer parcial"); nota3 = sn.nextDouble() *0.3;
        System.out.println("Nota del cuarto parcial"); nota4 = sn.nextDouble() *0.5;
        
        promedio = nota1 + nota2 + nota3 + nota4;
        
        if(promedio >0 && promedio <=59){
            System.out.println("Su promedio es de "+promedio+" pts, REPITE CURSO");
        } else if(promedio >59 && promedio <=69){
            System.out.println("Su promedio es de "+promedio+" pts, REGULAR");
        } else if(promedio >69 && promedio <=79){
            System.out.println("Su promedio es de "+promedio+" pts, BUENO");
        } else if(promedio >79 && promedio <=84){
            System.out.println("Su promedio es de "+promedio+" pts, MUY BUENO");
        } else if(promedio >84 && promedio <=100){
            System.out.println("Su promedio es de "+promedio+" pts, EXCELENTE");
        }
        
        } catch (Exception e) {
            System.out.println("Por favor, ingrese un valor valido: " +e);
        }
  
    }
    
}
