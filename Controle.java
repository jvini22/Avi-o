public class Controle {
    Fila fila = new Fila(10);
    Controle(){}
    void adicionarAviao(Aviao aviao){
        fila.enfileira(aviao);
    }

    void quantidadeFila(){
        System.out.println("Tem" + fila.tamanhoAtual() + "na fila!");
    }

    void decolar(){
        System.out.println(fila.getPrimeiro());
        fila.desenfileirar();
        System.out.println("O avião decolar!!");
    }
    void primeiroAviao(){
        Aviao primeiro = (Aviao) fila.getPrimeiro();
        System.out.println("Nome: " + primeiro.getNome() + "\nNumero: " + primeiro.getNumero());
    }
    void listarAvioes(){
        Aviao primeiro;
        for (int i = 0; i < fila.tamanhoAtual(); i++){
            primeiro = (Aviao) fila.getPrimeiro();
            System.out.println("Nome: " + primeiro.getNome() + "\nNumero: " + primeiro.getNumero());
            Object aux = fila.getPrimeiro();
            fila.desenfileirar();
            fila.enfileira(aux);
        }

    }



}
