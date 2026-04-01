package exercicios.core.modificadoresdeacesso.verificacaoidade;

public class Pessoa {
    private String nome;
    private int idade;

    // getters e setters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        // validação de idade
        if (idade < 0){
            System.out.println("\nIdade Inválida!");
            return;
        }
        this.idade = idade;
    }
}
