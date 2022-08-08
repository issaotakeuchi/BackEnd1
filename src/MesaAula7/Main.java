package MesaAula7;

public class Main {
    public static void main(String[] args) {
        ArvoreFactory arvoreFactory = new ArvoreFactory();
        Arvore ornamental = arvoreFactory.getArvore("ornamental", 200, 400,"verde");
        Arvore frutifera = arvoreFactory.getArvore("frutifera", 500, 300, "vermelho");
        Arvore florifera = arvoreFactory.getArvore("florifera", 100, 200, "azul");
        Arvore florifera2 = arvoreFactory.getArvore("florifera", 100, 200, "azul");

        System.out.println(ornamental.toString());
        System.out.println(frutifera.toString());
        System.out.println(florifera.toString());
        System.out.println(florifera2.toString());


        for (int i = 0; i < 500000; i++){
            System.out.println(ornamental.toString());
        }
        for (int i = 0; i < 500000; i++){
            System.out.println(frutifera.toString());
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}
