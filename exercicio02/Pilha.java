package exercicio02;

import javax.swing.JOptionPane;

public class Pilha {
    // Declarando os atributos da classe
    int topo;
    int tamanho;
    Aluno vetor[];

    public Pilha(int tam) {
        topo = -1; // Marca que a pilha está vazia
        tamanho = tam;
        vetor = new Aluno[tam];
    }

    public boolean vazia() {
        if (topo == -1)
            return true;
        else
            return false;
    }

    public boolean cheia() {
        if (topo == tamanho - 1)
            return true;
        else
            return false;
    }

    public void empilhar(Aluno aluno) {
        if (cheia() == false) {
            topo++;
            vetor[topo] = aluno;
        } else {
            JOptionPane.showMessageDialog(null,
                    "PILHA CHEIA!");
        }
    }

    public Aluno desempilhar() {
        Aluno valorDesempilhado = null;
        if (vazia() == true) {
            JOptionPane.showMessageDialog(
                null,
                "A Pilha está vazia!");
        } else {
            valorDesempilhado = vetor[topo];
            topo--;
        }
        return valorDesempilhado;
    }

    public void ExibePilha() {
        if (vazia()) {
            JOptionPane.showMessageDialog(
                    null,
                    "A pilha está vazia!");
        } else {
            String retorno = "";
            for (int i = topo; i >= 0; i--) {
                if (Integer.parseInt(vetor[i].toString()) != 0) {
                    retorno += (i + 1) + "ª posição: " + vetor[i] + "\n";
                }
            }

            JOptionPane.showMessageDialog(
                null,
                retorno);
        }
    }
}