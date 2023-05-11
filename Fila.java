import java.io.ObjectStreamException;

public class Fila {
    Object[] vetor;
    int primeiro, ultimo, tamanho;

    Fila(int quantidade){
        this.primeiro = 0;
        this.ultimo = 0;
        this.tamanho = 0;
        this.vetor = new Object[quantidade];
    }

    boolean estaVazio(){
        if (this.tamanho == 0){
            return true;
        }else{
            return false;
        }
    }

    boolean estaCheio(){
        if (this.tamanho == this.vetor.length){
            return true;
        }else{
            return false;
        }
    }

    void enfileira(Object elemento){
        if (estaCheio()){
            System.out.println("Fila Cheia!!");
        }else{
            this.vetor[ultimo] = elemento;
            this.ultimo = (this.ultimo + 1)
                    % this.vetor.length;
            this.tamanho++;
            System.out.println("Elemento Inserido!");
        }
    }

    void desenfileirar(){
        if (estaVazio()){
            System.out.println("Fila Vazia!!");
        }else{
            this.vetor[primeiro] = null;
            this.primeiro = (this.primeiro + 1)
                    % this.vetor.length;
            this.tamanho--;
            System.out.println("Elemento removido!");
        }
    }

    void imprimir(){

        for (int i = primeiro; i<= this.tamanho; i++ ){
            System.out.println(this.vetor[i]);
        }
        for (int i = 0; i< this.ultimo; i++){
            System.out.println(this.vetor[i]);
        }
    }

    public int tamanhoAtual(){
        return this.tamanho;
    }

    public Object getPrimeiro(){
        if (estaVazio()){
            return null;
        }else{
            return this.primeiro;
        }
    }
}
