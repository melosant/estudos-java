package exercicios.introducao;

/*
    Você tem um array que representa os IDs numéricos dos livros físicos
    disponíveis em uma prateleira: 102, 305, 412, 880, 951, 1004.
    Você quer verificar se o livro com ID 880 está lá.
    Crie um código que percorra o array procurando por esse ID. Se encontrar,
    mude uma variável booleana disponivel para true e pare a busca imediatamente
    (afinal, não precisa olhar o resto da prateleira). No final, imprima se o livro foi encontrado ou não.
*/
public class Ex08BuscaLivro {
    public static void main(String[] args) {
        int[] idsLivros = new int[]{102, 305, 412, 880, 951, 1004};
        int idLivroProcurado = 880;
        boolean disponivel = false;

        for (int i = 0; i < idsLivros.length; i++) {
            if (idsLivros[i] == idLivroProcurado) {
                disponivel = true;
                System.out.println("Livro encontrado na posição " + i);
                break;
            }
        }

        if (disponivel == true) {
            System.out.println("O livro " + idLivroProcurado + " está na prateleira!");
        } else {
            System.out.println("O livro " + idLivroProcurado + " está indisponível ou emprestado.");
        }
    }
}
