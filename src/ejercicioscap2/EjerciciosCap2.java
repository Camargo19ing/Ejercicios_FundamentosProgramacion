//By Luis Alberto Camargo Montero
//23 de Agosto de 2025

package ejercicioscap2;

import java.util.Scanner;

public class EjerciciosCap2 {
    
    public int Eje1(int a, int b){
        int sum, res, mul, div;
        sum = a + b;
        res = a-b;
        mul = a*b;
        div = a/b;
        
        System.out.println("La suma es: "+sum+"\nLa resta es: "+res+"\nLa multiplicación es: "+mul+"\nLa divisón es: "+div);
        return 0;
    }
    
    public int Eje2(int a, int b){
        int entero;
        if(a > b){
            while(b != 0){
                entero = a%b;
                a = b;
                b = entero;
            }
            System.out.println("El MCD es: "+a);
        }else{
            while(a != 0){
                entero = b%a;
                b = a;
                a = entero;
            }
            System.out.println("El MCD es: "+b);
        }
        return 0;
    }
    
    public void Eje3(){
        Scanner prueba = new Scanner(System.in);
        int contar = 0, numero, evaluar;
        
        System.out.println("Ingrese un número difernte a 0");
        numero = prueba.nextInt();
        
        while (numero != 0){
            contar++;
            numero = prueba.nextInt();
        }
        System.out.println("Numero contados "+contar);
    }
    
    public int Eje4(){
        int inicio, incremento, suma;
        inicio = 1;
        incremento = 3;
        suma = 0;
        while(inicio < 34){
            suma += inicio * incremento;
            inicio++;
        }
        System.out.println("La suema de la serie de 3 es: "+suma);
        return 0;
    }
    
    public void Eje5(int a, int b, int c, int d){
        int mayor;
    }
    
    public static void main(String[] args) {
        EjerciciosCap2 eje1 = new EjerciciosCap2();
        System.out.print("Ejercicios del Libro Fundamentos de la Programación, Capitulo 2:");
        System.out.println("Ejercicios resueltos:\n"
                + "1.- Escribir un algoritmo para:"
                + "\na) Sumar dos numeros enteros"
                + "\nb) Restar dos numeros enteros"
                + "\nc) Multipliar dos numeros enteros"
                + "\nd) Dividir dos numeros enteros"
                + "\n2.- Escribir un algoritmo para determinar el Maximo Común Divisor de dos numeros enteros "
                + "por el algoritmo de Euclides"
                + "\n3.- Diseñar un algoritmo que lea y visualice una serie de número distintos de cero."
                + "El algoritmo debe terminar con un valor cero que no se debe visualizar. Visualizar el número de valores leídos."
                + "\n4.- Diseñar un algoritmo que visualice y sume la serie de número 3, 6, 9, 12 ... 99");
        
        Scanner op = new Scanner(System.in);
        System.out.println("¿Que ejercicio dese ver?");
        int a;
        a = op.nextInt();
        
        switch(a){
            case 1: 
                Scanner c1 = new Scanner(System.in);
                int num1, num2;
                System.out.println("Digite un numero: ");
                num1 = c1.nextInt();
                System.out.println("Digite un numero: ");
                num2 = c1.nextInt();
                
                eje1.Eje1(num1, num2);
                break;
                
            case 2:
                Scanner c2 = new Scanner(System.in);
                int num3, num4;
                
                System.out.println("Digite un numero: ");
                num3 = c2.nextInt();
                
                System.out.println("Digite un numero");
                num4 = c2.nextInt();
                eje1.Eje2(num3, num4);
                break;
                
            case 3: 
                eje1.Eje3();
                break;
                
            case 4: 
                eje1.Eje4();
                break;
                
            default: 
                System.out.println("Ejercicio no encontrado");
        }
    }
}      