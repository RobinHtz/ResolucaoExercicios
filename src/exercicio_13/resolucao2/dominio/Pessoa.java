package exercicio_13.resolucao2.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private boolean isMaiorDeIdade;

    public Pessoa() {
    }

    public void maiorDeIdade() {
        setIsMaiorDeIdade(getIdade() >= 18);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setIsMaiorDeIdade(boolean isMaiorDeIdade) {
        this.isMaiorDeIdade = isMaiorDeIdade;
    }
    public boolean getIsMaiorDeIdade() {
        return isMaiorDeIdade;
    }
}