public class FuncionesRecursivas {

    public static int suma_recursiva(int entero) {
        if (entero == 1) {
            return 1;
        } else {
            return entero + suma_recursiva(entero - 1);
        }
    }
    public static int suma_digitos_recursiva(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + suma_digitos_recursiva(n / 10);
        }
    }
    public static String invertir_cadena(String cadena) {
        if (cadena.length() == 1) {
            return cadena;
        } else {
            return cadena.charAt(cadena.length() - 1) + invertir_cadena(cadena.substring(0, cadena.length() - 1));
        }
    }
}
