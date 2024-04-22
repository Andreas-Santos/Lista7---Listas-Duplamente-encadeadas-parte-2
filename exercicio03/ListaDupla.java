package exercicio03;

import javax.swing.JOptionPane;

public class ListaDupla {
    AlunoNoDuplo primeiro, ultimo;
    int numero_nos;

    public ListaDupla() {
        primeiro = ultimo = null;
        numero_nos = 0;
    }

    public void insereNo(AlunoNoDuplo novoNo) {
        novoNo.prox = null;
        novoNo.ant = ultimo;
        if (primeiro == null)
            primeiro = novoNo;
        if (ultimo != null)
            ultimo.prox = novoNo;
        ultimo = novoNo;
        numero_nos++;
    }

    public AlunoNoDuplo pegarNo(int indice) {
        AlunoNoDuplo temp_no = primeiro;
        for (int i = 0; (i < indice) && (temp_no != null); i++)
            temp_no = temp_no.prox;
        return temp_no;
    }

    public void incluiNo(AlunoNoDuplo novoNo, int indice) {
        AlunoNoDuplo temp_no = pegarNo(indice);
        novoNo.prox = temp_no;
        if (novoNo.prox != null) {
            novoNo.ant = temp_no.ant;
            novoNo.prox.ant = novoNo;
        } else {
            novoNo.ant = ultimo;
            ultimo = novoNo;
        }
        if (indice == 0)
            primeiro = novoNo;
        else
            novoNo.ant.prox = novoNo;
        numero_nos++;
    }

    public void excluiNo(int indice) {
        if (indice == 0) {
            primeiro = primeiro.prox;
            if (primeiro != null)
                primeiro.ant = null;
        } else {
            AlunoNoDuplo temp_no = pegarNo(indice);
            temp_no.ant.prox = temp_no.prox;
            if (temp_no != ultimo) {
                temp_no.prox.ant = temp_no.ant;
            } else {
                ultimo = temp_no;
            }
        }
        numero_nos--;
    }

    public void exibirLista() {
        String retornoLista = "";
        AlunoNoDuplo temp_no = primeiro;
        int i = 1;

        while (temp_no != null) {
            retornoLista += "Aluno número " + i + ":\n" +
                    "Nome: " + temp_no.aluno.getNome() + "\n" +
                    "RA: " + temp_no.aluno.getRa() + "\n" +
                    "Curso: " + temp_no.aluno.getCurso() + "\n";
            i++;

            temp_no = temp_no.prox;
        }

        JOptionPane.showMessageDialog(null, retornoLista);
    }
}