package exercicio01;

import javax.swing.JOptionPane;

public class Pilha {
    //Declarando os atributos da classe
    int topo;
    int tamanho;
    Object vetor[];
    
    public Pilha(int tam){
        topo = -1; //Marca que a pilha está vazia
        tamanho = tam;
        vetor = new Object[tam];
    }
    public boolean vazia(){
        if (topo == -1)
            return true;
        else
            return false;
    }
    public boolean cheia(){
        if(topo == tamanho -1)
            return true;
        else
            return false;
    }
    public void empilhar(Object elem){
        if (cheia() == false){
            topo++;
            vetor[topo]=elem;
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "PILHA CHEIA!");
        }
    }
    public Object desempilhar(){
        Object valorDesempilhado;
        if(vazia() == true){
            valorDesempilhado = "Pilha Vazia";
        }
        else{
            valorDesempilhado = vetor[topo]; 
            topo--;
        }
        return valorDesempilhado;
    }
    public void ExibePilha(){
        if(vazia()){
            JOptionPane.showMessageDialog(
                null, 
                "A pilha está vazia!");
        }
        else{
            String retorno = "";
            for(int i=topo; i>=0; i--){
                if(Integer.parseInt(vetor[i].toString()) != 0) {
                    retorno += (i + 1) + "ª posição: " + vetor[i] + "\n";
                }
            }

            JOptionPane.showMessageDialog(
                null,
                retorno);
        }
    }
}