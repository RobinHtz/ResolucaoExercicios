package exercicio_13.resolucao2.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if(idade>0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
    public int getIdade() {
        return idade;
    }

    public void impressao() {
        if(getIdade()>0) {
            System.out.println("Nome: "+getNome());
            maiorDeIdade();
        }
    }

    public void maiorDeIdade() {
        if(getIdade()>=18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
    }
}
