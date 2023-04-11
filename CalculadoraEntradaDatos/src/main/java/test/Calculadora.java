package test;

import java.util.Scanner;
import static calculadora.Operaciones.*;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Proporciona el segundo valor:");
        int b = scanner.nextInt();
        int resultadoSuma = sumar(a, b);
        System.out.println("resultadoSuma = " + resultadoSuma);
        int resultadoResta = restar(a, b);
        System.out.println("resultadoResta = " + resultadoResta);
        int resultadoMultiplicacion = multiplicar(a, b);
        System.out.println("resultadoMultiplicacion = " + resultadoMultiplicacion);
        int resultadoDivision = dividir(a, b);
        System.out.println("resultadoDivision = " + resultadoDivision);
        
    }

}
