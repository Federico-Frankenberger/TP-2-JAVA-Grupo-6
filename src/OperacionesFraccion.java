import java.util.Scanner;
public class OperacionesFraccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuatro valores númericos enteros:");

        System.out.println("Valor 1:");
        int numerador1 = sc.nextInt();
        System.out.println("Valor 2:");
        int denominador1 = sc.nextInt();

        System.out.println("Valor 3:");
        int numerador2 = sc.nextInt();
        System.out.println("Valor 4:");
        int denominador2 = sc.nextInt();

        Fraccion f1 = new Fraccion(numerador1,denominador1);
        Fraccion f2 = new Fraccion(numerador2,denominador2);

        // Realizar operaciones //
        Fraccion suma = f1.sumarFracciones(f1, f2);
        Fraccion resta = f1.restarFracciones(f1, f2);
        Fraccion multiplicacion = f1.multiplicarFracciones(f1, f2);
        Fraccion division = f1.dividirFracciones(f1, f2);

        // Mostrar resultados //
        System.out.println("La suma de las fracciones es: " + suma);
        System.out.println("La resta de las fracciones es: " + resta);
        System.out.println("La multiplicación de las fracciones es: " + multiplicacion);
        System.out.println("La división de las fracciones es: " + division);
    }

}
