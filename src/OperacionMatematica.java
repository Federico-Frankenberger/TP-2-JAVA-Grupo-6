public class OperacionMatematica {
    private Double valor1;
    private Double valor2;
    private String operacion;

    public OperacionMatematica() {

    }
    public OperacionMatematica(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    private double sumarNumeros(){
        return valor1 + valor2;
    }
    private double restarNumeros(){
        return valor1 - valor2;
    }
    private double multiplicarNumeros(){
        return valor1 * valor2;
    }
    private double dividirNumeros(){
        return valor1 / valor2;
    }
    public double aplicarOperacion(String operacion){
        this.operacion = operacion;
        switch (operacion) {
            case "+":
                return sumarNumeros();
            case "-":
                return restarNumeros();
            case "*":
                return multiplicarNumeros();
            case "/":
                return dividirNumeros();
            default:
                throw new IllegalArgumentException("Operación no válida.");

        }
    }
}
