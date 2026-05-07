package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println("Nome impresso por método de classe: " + this.nome);
        System.out.println("Idade impressa por método de classe: " + this.idade);
    }

    // setters e getters para atributos privados.
    // this é imprenscidível nos setters e getters, pois passamos um argumento com o mesmo nome de variável do objeto.
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
}
