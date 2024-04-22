package exercicio02;

public class AlunoNoDuplo {
    Aluno aluno;
    AlunoNoDuplo prox;
    AlunoNoDuplo ant;
 
    public AlunoNoDuplo (Aluno aluno){
        this.aluno = aluno;
        prox = ant = null;
    }
}
