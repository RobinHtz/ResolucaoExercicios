package exercicio_9.resolucao2.dominio;

public class Pessoa {
    private double altura,peso,IMC;

    public Pessoa(){}

    public void calcularIMC() {
        setIMC(getPeso() / (getAltura() * getAltura()));
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setIMC(double IMC) {
        this.IMC = IMC;
    }
    public double getIMC() {
        return IMC;
    }
}
