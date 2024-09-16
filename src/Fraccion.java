public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.setDenominador(denominador);
        simplificar();
    }
    //Metodo para simplificar usando el algoritmo de Euclides//
    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }


    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador debe ser distinto de 0");
        } else {
            this.denominador = denominador;
        }
    }
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        int numerador = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
        int denominador = f1.denominador * f2.denominador;
        return new Fraccion(numerador, denominador);
    }
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        int numerador = f1.numerador * f2.denominador - f2.numerador * f1.denominador;
        int denominador = f1.denominador * f2.denominador;
        return new Fraccion(numerador, denominador);
    }
    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        int numerador = f1.numerador * f2.numerador;
        int denominador = f1.denominador * f2.denominador;
        return new Fraccion(numerador, denominador);
    }
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        int numerador = f1.numerador * f2.denominador;
        int denominador = f1.denominador * f2.numerador;
        return new Fraccion(numerador, denominador);
    }

    //Metodo para mostrar la fracción en forma de cadena//
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}


