public class Main {
    public static void main(String[] args) {
       Aviao aviao1 = new Aviao("Boing123", "123");
       Aviao aviao2 = new Aviao("Tam", "456");

       Controle controle = new Controle();
       controle.adicionarAviao(aviao1);
       controle.adicionarAviao(aviao2);
       controle.listarAvioes();
    }
}
