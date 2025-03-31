package exercicio_18.dominio;

public class Pessoa {
    private final String nome;
    private double altura;
    private final double crescimentoPorAno;

    public Pessoa(String nome, double altura, double crescimentoPorAno) {
        this.nome = nome;
        this.altura = altura;
        this.crescimentoPorAno = crescimentoPorAno;
    }

    public void crescer() {
        setAltura(getAltura()+crescimentoPorAno);
    }


    public String getNome() {
        return nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    public double getCrescimentoPorAno() {
        return crescimentoPorAno;
    }
}
