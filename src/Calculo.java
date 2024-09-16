public class Calculo {
    public static void main(String[] args) {
        OperacionMatematica opereta = new OperacionMatematica();
        opereta.setValor1(10.5);
        opereta.setValor2(7.5);

        try {
            System.out.println("Resultado de la suma (+): " + opereta.aplicarOperacion("+"));
            System.out.println("Resultado de la resta (-): " + opereta.aplicarOperacion("-"));
            System.out.println("Resultado de la multiplicación (*): " + opereta.aplicarOperacion("*"));
            System.out.println("Resultado de la división (/): " + opereta.aplicarOperacion("/"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
