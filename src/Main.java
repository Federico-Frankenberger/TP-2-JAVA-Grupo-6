import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
public  class Main {
    public static void main (String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int num;
        int num_2;
        String cadena = "";
        System.out.println("----------------------------------- \n¡Bienvenido al Trabajo Práctico 2!\n-----------------------------------");
        System.out.println("Grupo: 6 \nIntegrantes: - Miguel Barrera - Emilia Barros -  Federico Frankenberger  - Guadalupe Maricchiolo - \n-----------------------------------");
        System.out.println("-Ingrese-\n1 / Continuar \n2 / Salir\n-----------------------------------");
        do {
            num = sc.nextInt();
            switch (num){
                case 1 :
                    do {
                        System.out.println("------------\n EJERCICIOS \n------------");
                        System.out.println("-Ingrese-\n-- 1 a 23 para ejercicios\n-- 24 para salir");
                        num_2 = sc.nextInt();
                        switch (num_2){
                            case 1:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 1:");
                                System.out.println("Ingrese en número decimal:");
                                double valorDecimal = sc.nextDouble();
                                short valorShort = (short) valorDecimal;
                                int valorInt = (int) valorDecimal;
                                long valorLong = (long) valorDecimal;
                                String valorString = String.valueOf(valorDecimal) ;
                                System.out.println("Short: "+ valorShort);
                                System.out.println("Int: " + valorInt);
                                System.out.println("Long: " + valorLong);
                                System.out.println("String: " + valorString);
                                System.out.println("-------------------------------------");
                                break;
                            case 2:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 2:");
                                // Si se asigna un valor mayor al establecido se produce un desbordamiento (Overflow)//
                                // Lo correcto sería hacer una verificación del rango y, si no se encuentra dentro del rango permitido, castear a un tipo de dato de mayor capacidad.//
                                System.out.println("Ingrese en número decimal:");
                                valorDecimal = sc.nextDouble();
                                if (valorDecimal < Short.MIN_VALUE || valorDecimal > Short.MAX_VALUE){
                                    System.out.println("El valor está fuera del rango permitido para un short.");
                                    System.out.println("Se cambia el tipo de dato a int");
                                    valorInt = (int) valorDecimal;
                                    System.out.println("El valor casteado a int es: " + valorInt);

                                }else {
                                    valorShort = (short) valorDecimal;
                                    System.out.println("Valor double original: " + valorDecimal);
                                    System.out.println("Valor short despúes del casteo: " + valorShort);
                                }

                                System.out.println("-------------------------------------");
                                break;
                            case 3:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 3:");
                                System.out.println("Ingrese un número de tres dígitos 100 - 999");
                                int sumaDigitos = 0;
                                int numero ;
                                do{
                                    numero = sc.nextInt();
                                    int numeroDos = numero;
                                    if (numeroDos >= 100 && numeroDos <= 999){
                                        for (int i = 0 ; i <= 2; i = i+1){
                                            sumaDigitos = sumaDigitos + (numeroDos % 10);
                                            numeroDos = numeroDos / 10 ;
                                        }
                                    }else {
                                        System.out.println("Número mal ingresado, intente nuevamente!");
                                    }
                                }while (numero < 100 || numero > 999);
                                System.out.println("La suma de los tres dígitos es: " + sumaDigitos);
                                System.out.println("-------------------------------------");
                                break;
                            case 4:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 4:");
                                System.out.println("Ingrese el valor para determinar la cantidad de monedas y billetes: ");
                                double valor = sc.nextDouble();
                                double billete1= 0; //200//
                                double billete2= 0; //100//
                                double billete3= 0; //50//
                                double billete4= 0; //20//
                                double billete5= 0; //10//
                                double billete6= 0; //5//
                                double billete7= 0; //2//
                                double billete8= 0; //1//
                                double moneda1=0; //0.5//
                                double moneda2=0; //0.2//
                                double moneda3=0; //0.1//
                                double moneda4=0; //0.05//
                                do{
                                    System.out.println(valor);
                                    if (valor >= 200 ){
                                        valor = valor - 200;
                                        billete1 ++ ;
                                    } else if (valor <= 199 && valor >= 100) {
                                        valor = valor - 100;
                                        billete2 ++ ;
                                    } else if (valor <=99 && valor >= 50) {
                                        valor = valor - 50;
                                        billete3 ++ ;
                                        System.out.println("problema");
                                    } else if (valor <= 49 && valor >= 20) {
                                        valor = valor - 20;
                                        billete4 ++ ;
                                    } else if (valor <= 19 && valor >= 10) {
                                        valor = valor - 10;
                                        billete5 ++ ;
                                    } else if (valor <= 9 && valor >= 5) {
                                        valor = valor - 5;
                                        billete6 ++ ;
                                    } else if (valor <= 4 && valor >=2) {
                                        valor = valor - 2;
                                        billete7 ++ ;
                                    } else if (valor <= 1.99 && valor >=1 ) {
                                        valor = valor - 1;
                                        billete8 ++ ;
                                    } else if (valor <= 0.99 && valor >= 0.5) {
                                        valor = valor - 0.5;
                                        moneda1 ++ ;
                                    } else if (valor <=0.49 && valor >= 0.2){
                                        valor = valor - 0.2;
                                        moneda2 ++ ;
                                    } else if (valor <= 0.19 && valor >=0.1) {
                                        valor = valor - 0.1;
                                        moneda3 ++ ;
                                    } else {
                                        valor = 0;
                                        moneda4 ++;
                                    }
                                }while (valor > 0);
                                System.out.println("Debe entregar:");
                                System.out.println("Billetes de $200 : " + billete1);
                                System.out.println("Billetes de $100: " + billete2);
                                System.out.println("Billetes de $50: " + billete3);
                                System.out.println("Billetes de $20: " + billete4);
                                System.out.println("Billetes de $10: " + billete5);
                                System.out.println("Billetes de $5: " + billete6);
                                System.out.println("Billetes de $2: " + billete7);
                                System.out.println("Billetes de $1: " + billete8);
                                System.out.println("Monedas de $0.5: " + moneda1);
                                System.out.println("Monedas de $0.2: " + moneda2);
                                System.out.println("Monedas de $0.1: " + moneda3);
                                System.out.println("Monedas de $0.05: " + moneda4);
                                System.out.println("-------------------------------------");
                                break;
                            case 5:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 5:");
                                System.out.println("Ingrese un número:");
                                numero = sc.nextInt();
                                String numeroString = String.valueOf(numero);
                                System.out.println("Su número en String queda: : " + numeroString);
                                System.out.println("-------------------------------------");
                                break;
                            case 6:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 6:");
                                cadena = "La lluvia en Mendoza es escasa";
                                System.out.println("El tamaño de la cadena es de: "+ cadena.length());
                                System.out.println("-------------------------------------");
                                break;
                            case 7:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 7:");
                                System.out.println("Ingrese una cadena para saber la cantidad de vocales: ");
                                sc.nextLine();
                                cadena = sc.nextLine();
                                int tamano = Integer.valueOf(cadena.length());
                                int contador=0;
                                for (int i = 0; i <=tamano -1;i = i +1){
                                    String resultado = String.valueOf(cadena.charAt(i));
                                    if ("aeiou".contains(resultado)){
                                        contador ++;
                                    }
                                }
                                System.out.println("El tamaño de la cadena es de: "+ cadena.length());
                                System.out.println("La cantidad total de vocales es de : " + contador );
                                System.out.println("-------------------------------------");
                                break;
                            case 8:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 8:");
                                String cambio = cadena.replace("a","e");
                                System.out.println("Se cambiaron a por e en su cadena y queda: ");
                                System.out.println(cambio);
                                System.out.println("-------------------------------------");
                                break;
                            case 9:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 9:");
                                cadena = "La lluvia en Mendoza es escasa";
                                tamano = Integer.valueOf(cadena.length());
                                for (int i = 0; i <=tamano -1;i = i +1){
                                    String resultado = String.valueOf(cadena.charAt(i));
                                    byte[] valorASCII = resultado.getBytes();
                                    // Tambíen podríamos usar "valorASCII = (int) resultado;" pero preferimos usar el metodo bytes //
                                    if (i<tamano){
                                        System.out.print(valorASCII[0] + " ");
                                    }else if (i == tamano) {
                                        System.out.println(valorASCII[0]);
                                    }
                                }
                                System.out.println();
                                System.out.println("-------------------------------------");
                                break;
                            case 10:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 10:");
                                System.out.println("Ingrese una frase:");
                                sc.nextLine();
                                String frase = sc.nextLine();
                                System.out.println("Seleccione 1 para Mayúsculas o 2 para Minúsculas");
                                numero = sc.nextInt();
                                switch (numero){
                                    case 1 :
                                        System.out.println(frase.toUpperCase());
                                        break;
                                    case 2:
                                        System.out.println(frase.toLowerCase());
                                        break;
                                    default:
                                        System.out.println("Opción incorrecta!");
                                }
                                System.out.println("-------------------------------------");
                                break;
                            case 11:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 11:");
                                System.out.println("Ingrese dos palabras:");
                                System.out.println("palabra 1: ");
                                sc.nextLine();
                                String palabraOne = sc.nextLine();
                                System.out.println("palabra 2: ");
                                String palabraTwo = sc.nextLine();
                                if (palabraOne.equalsIgnoreCase(palabraTwo)){
                                    System.out.println("Ambas palabras son iguales!");
                                }else {
                                    System.out.println("Las palabras no son iguales!");
                                }

                                System.out.println("-------------------------------------");
                                break;
                            case 12:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 12:");
                                System.out.println("Ingrese una cadena: ");
                                sc.nextLine();
                                cadena = sc.nextLine();
                                System.out.println("La cuarta letra de la cadena es: " + (cadena.substring(3, 4)));
                                System.out.println("La quinta letra de la cadena es: " + (cadena.substring(4, 5)));
                                System.out.println("-------------------------------------");
                                break;
                            case 13:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 13:");
                                System.out.println("Ingrese dos cadenas ! ");
                                System.out.println("Ingrse la primer cadena:");
                                sc.nextLine();
                                cadena = sc.nextLine();
                                System.out.println("Ingrse la segunda cadena:");
                                String cadenados = sc.nextLine();
                                if(cadena.contains(cadenados)){
                                    System.out.println("La cadena dos se encuentra dentro de la cadena uno!");
                                }else {
                                    System.out.println("La cadena dos no se encuentra dentro de la cadena uno");
                                }
                                System.out.println("-------------------------------------");
                                break;
                            case 14:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 14:");
                                /* La diferencia entre ambos es que los tipos de datos primitivos son datos básicos y se almacenan directamente en la memoria stack,
                                mientras que los tipos de datos de referencia son más complejos, representando objetos o arreglos, y se almacenan en la memoria heap. */
                                System.out.println("-------------------------------------");
                                break;
                            case 15:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 15:");
                                /* Si ejecuto el código, se genera un error de tipo incompatible,
                                ya que `int` es un tipo de dato primitivo y no se le puede asignar el valor `null`. */

                                /* Lo que debemos hacer es asignarle el tipo de dato `Integer`, que es un tipo de dato por referencia
                                 y puede tomar el valor `null`. */
                                System.out.println("-------------------------------------");
                                break;
                            case 16:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 16:");
                                //Para convertir una variable de tipo Double a una variable de tipo double utilizamos "doubleValue()"//
                                //A continuación se muetra un ejemplo://
                                Double objetoDouble = 10.5;
                                double valorPrimitivo = objetoDouble.doubleValue();
                                System.out.println("-------------------------------------");
                                break;
                            case 17:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 17:");
                                Date date = new Date();
                                System.out.println(FuncionesPrograma.getFechaString(date));
                                System.out.println("-------------------------------------");
                                break;
                            case 18:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 18:");
                                System.out.println(FuncionesPrograma.getFechaDate(13,9,1994));
                                System.out.println("-------------------------------------");
                                break;
                            case 19:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 19:");
                                //Resolución en://
                                //Clase Calculo (main) y OperacionesMatematica//
                                System.out.println("-------------------------------------");
                                break;
                            case 20:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 20:");
                                //Resolución en://
                                //Clase OperacionesFraccion (main) y Fraccion)//
                                System.out.println("-------------------------------------");
                                break;
                            case 21:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 21:");
                                System.out.println("Ingrese un número entero mayor que cero:");
                                int n = sc.nextInt();
                                int resultado = FuncionesRecursivas.suma_recursiva(n);
                                System.out.println("La suma de los números desde " + n + " hasta 1 es " + resultado);
                                System.out.println("-------------------------------------");
                                break;
                            case 22:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 22:");
                                System.out.println("Ingrese un número entero positivo:");
                                int num1 = sc.nextInt();
                                int sumaDeDigitos = FuncionesRecursivas.suma_digitos_recursiva(num1);
                                System.out.println("La suma de los dígitos de " + num1 + " es " + sumaDeDigitos);
                                System.out.println("-------------------------------------");
                                break;
                            case 23:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 23:");
                                System.out.print("Introduce una cadena de texto: ");
                                sc.nextLine();
                                String cadena1 = sc.nextLine();
                                String cadenaInvertida = FuncionesRecursivas.invertir_cadena(cadena1);
                                System.out.println("La cadena invertida es: " + cadenaInvertida);
                                System.out.println("-------------------------------------");
                                break;
                            case 24:
                                System.out.println("-------------------------------------");
                                System.out.println("Gracias por su corección!");
                                System.out.println("-------------------------------------");
                                num = 2;
                                break;
                            default:
                                System.out.println("--------------------------------------------------");
                                System.out.println("ERROR - número fuera de rango - vuleva a intentar!");
                                System.out.println("--------------------------------------------------");
                        }

                    }while(num==1);
                    break;
                case 2 :
                    System.out.println("--------");
                    System.out.println("Gracias!");
                    System.out.println("--------");
                    break;
                default:
                    System.out.println("- Número fuera de rango - Intente nuevamente -\n1 / Continuar \n2 / Salir");
            }
        }while (num != 2);


    }
}
