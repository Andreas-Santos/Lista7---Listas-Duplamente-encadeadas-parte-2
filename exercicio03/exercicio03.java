// 3. Modifique o exercício anterior, possibilitando exibir (usando uma única caixa de diálogo) 
// todos os alunos existentes na lista duplamente encadeada.

package exercicio03;

import javax.swing.JOptionPane;

public class exercicio03 {
    public static void main(String[] args) {
        Pilha p = new Pilha(8);
        ListaDupla ld = new ListaDupla();

        while (!p.cheia()) {
            Aluno aluno = new Aluno();

            aluno.setNome(JOptionPane.showInputDialog(
                    null,
                    "Digite o nome do aluno:"));

            aluno.setRa(JOptionPane.showInputDialog(
                    null,
                    "Digite o RA do aluno:"));

            aluno.setCurso(JOptionPane.showInputDialog(
                    null,
                    "Digite o nome do curso do aluno:"));

            p.empilhar(aluno);
        }

        JOptionPane.showMessageDialog(
                null,
                "Passando alunos da pilha que fazem ADS para a Lista...");
        while (!p.vazia()) {
            Aluno alunoDesempilhado = p.desempilhar();

            if (alunoDesempilhado.getCurso().equals("ADS")) {
                ld.insereNo(new AlunoNoDuplo(alunoDesempilhado));
            }
        }
        
        ld.exibirLista();
    }
}