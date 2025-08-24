//By Luis Alberto Camargo Montero
//23 de Agosto de 2025

package ejercicioscap2;

import java.util.Scanner;

public class EjerciciosCap2 {
    public static void main(String[] args) {
        System.out.println("Ejercicios del Libro Fundamentos de la Programación, Capitulo 2\n");
        System.out.println("Elija un ejercicio:\n"
                + "Ejercicio 1\nEjercicio 2\nEjercicio 3\nEjercicio 4\nEjercicio5");
        
        int inciso = 0;
        Scanner op = new Scanner(System.in);
        System.out.print("Eliga el ejercicio: ");
        inciso = op.nextInt();
        switch(inciso){
            case 1:
                System.out.println("1. Escribir un algoritmo para:\na) Sumar dos números entereos\nb) Restar dos numeros enteros"
                        + "\nc) Multiplicar dos números enteros\nd) Dividir un número entero por otro");
            int a, b, suma, resta, multiplicacion, divison;
            //Declarando los valores
            Scanner leer = new Scanner(System.in);
            System.out.print("Digite el valor de a: ");
            a = leer.nextInt();

            System.out.print("Digite el valor de b: ");
            b = leer.nextInt();
            //Elaborando las operaciones
            suma = a +b;
            resta = a-b;
            multiplicacion = a*b;
            divison = a/b;
            //Mostrando resultados
            System.out.println("La suma es: "+suma);
            System.out.println("La resta es: "+resta);
            System.out.println("La multiplicacion es: "+multiplicacion);
            System.out.println("La divison es: "+divison);
            break;
        
            case 2:
                System.out.println("Escribir un algoritmo para determinar el MCV por el algoritmo de Euclidés");
                Scanner s2 = new Scanner(System.in);
                int s2a, s2b, entero;
                
                System.out.println("Digite el valor de A: ");
                s2a = s2.nextInt();
                
                System.out.println("Digite el valor de B: ");
                s2b = s2.nextInt();
                
                if(s2a > s2b){
                    while(s2b != 0){
                        entero = s2a % s2b;
                        s2a = s2b; 
                        s2b = entero;
                    } 
                    System.out.println("El MCD es: "+s2a);
                }else{
                    while(s2a != 0){
                        entero = s2a % s2b;
                        s2b = s2a; 
                        s2a = entero;
                    } 
                    System.out.println("El MCD es: "+s2b);
                } break;
            
            
            case 3: 
                System.out.println("Diseñar un algoritmo que lea y visualice una serie de números distitnos de cero."
                        + "El algoritmo debe terminar con un valor cero que no se debe visualizar."
                        + "Visualizar el número de vlores leídos");
                Scanner leer3 = new Scanner(System.in);
                int contar=0,serie, i3=0, evaluar=0;
                System.out.print("¿Cuantas numero desea ingresar?: ");
                serie = leer3.nextInt();
                
                while(i3 < serie){
                    System.out.print("Coloque un numero entre 0 y 9");
                    evaluar = leer3.nextInt();
                    if(evaluar != 0){
                        contar++;
                    }
                    i3++;
                }
                
                System.out.println("Se evaluaron un total de "+contar+" numeros");
                break;

            case 4: 
                System.out.println("Diseñar un algoritmo que visualice y sume la serie de número 3, 6, 9, 12... 99");
                int num=3, incremento=1, sum=0, mult=0;
                while(incremento <= 33){
                    mult = num * incremento;
                    sum +=mult;
                    incremento++;
                }
                System.out.println("La suma de la serie de 3 es: "+sum);
                break;

            case 5: 
                System.out.println("Diseñar un algoritmo que lea cuatro números y a continuación visualice el mayor de los cuatro");
                Scanner c5 = new Scanner(System.in);
                
            default: System.out.print("");
        }
    }   
}