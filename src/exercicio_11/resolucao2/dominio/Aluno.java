package exercicio_11.resolucao2.dominio;

public class Aluno {
    private String nome;
    private double[] notas;
    private double media;
    private boolean isAprovado;

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
        setIsAprovado(getMedia() >= 7);
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

    public boolean getIsAprovado() {
        return isAprovado;
    }
    public void setIsAprovado(boolean isAprovadoOuReprovado) {
        this.isAprovado = isAprovadoOuReprovado;
    }
}