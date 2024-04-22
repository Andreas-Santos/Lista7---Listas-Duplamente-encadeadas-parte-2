// 1. Crie um programa que possua um menu de interação com o usuário que possibilite ele adicionar elementos
// (valores inteiros) em uma fila, pilha ou lista duplamente encadeada. Após inserir os valores, exiba os 
// elementos existentes na estrutura que foi escolhida para inserção.

package exercicio01;

import javax.swing.JOptionPane;

public class exercicio01 {
    public static void main(String[] args) {
        int opcao;
        int valor;

        opcao = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Selecione a opção de estrutura de dados desejada:\n" +
                        "1 - Fila\n" +
                        "2 - Pilha\n" +
                        "3 - Lista Dupla"));

        switch (opcao) {
            case 1:
                Fila f = new Fila(5);

                do {
                    valor = Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Digite o valor que deseja incluir na fila (ou 0 para parar a inserção):"));

                    if (valor == 0) {
                        break;
                    } else {
                        f.enfileirar(valor);
                    }
                } while (!f.cheia() && valor != 0);

                f.exibeFila();

                break;

            case 2:
                Pilha p = new Pilha(5);

                do {
                    valor = Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Digite o valor que deseja incluir na Pilha (ou 0 para parar a inserção):"));

                    if (valor == 0) {
                        break;
                    } else {
                        p.empilhar(valor);
                    }
                } while (!p.cheia() && valor != 0);

                p.ExibePilha();

                break;

            case 3:
                ListaDupla ld = new ListaDupla();

                do {
                    valor = Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Digite o valor que deseja incluir na Lista (ou 0 para parar a inserção):"));

                    if (valor == 0) {
                        break;
                    } else {
                        ld.insereNo(new IntNoDuplo(valor));
                    }
                } while (valor != 0);

                ld.exibirLista();

                break;

            default:
                JOptionPane.showMessageDialog(
                        null,
                        "O valor digitado não é válido, tente novamente!");
                break;
        }
    }
}