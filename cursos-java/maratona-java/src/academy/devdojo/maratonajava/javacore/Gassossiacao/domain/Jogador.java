package academy.devdojo.maratonajava.javacore.Gassossiacao.domain;

public class Jogador {
    private String nome;
    // variável fazendo ref ao objeto
    private Time time;

    public void imprime(){
        System.out.println(this.nome);
        if (time != null){
            // a variável é uma referência ao objeto, logo se fosse this.time viria o endereço
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
