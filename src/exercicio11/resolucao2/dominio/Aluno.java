package exercicio11.resolucao2.dominio;

public class Aluno {
    private String nome;
    private double[] notas;
    private double media;

    public Aluno(){
    }

    public double calcularMedia() {
        double aux = 0;
        for(double nota : notas){
            aux += nota;
            setMedia(aux/notas.length);
        }
        return getMedia();
    }

    public void aprovadoOuReprovado() {
        if(getMedia()>=7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
}