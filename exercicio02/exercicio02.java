// 2. Crie uma pilha com 8 elementos que serão objetos da classe Aluno. Um aluno possui nome, ra e curso. 
// Solicite ao usuário os dados de cada aluno a ser inserido na Pilha. Após a inserção, remova os elementos 
// da Pilha e verifique quais alunos possuem "ADS" como curso cadastrado e insira em uma lista duplamente 
// encadeada. Após a inserção dos elementos na lista duplamente encadeada, permita ao usuário buscar um aluno 
// pelo seu nome e exiba o seu RA.

package exercicio02;

import javax.swing.JOptionPane;

public class exercicio02 {
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

        String nomeAluno;
        nomeAluno = JOptionPane.showInputDialog(
                null,
                "Digite o nome do aluno de ADS que deseja procurar na lista:");

        JOptionPane.showMessageDialog(
                null,
                ld.buscaAlunoNome(nomeAluno));
    }
}