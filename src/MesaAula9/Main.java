package MesaAula9;

import static MesaAula9.RoupaFactory.tamanhoM;

public class Main {
    public static void main(String[] args) {
        RoupaFactory roupaFactory = new RoupaFactory();

        Roupa calcaImportM = roupaFactory.getRoupa("m","calca", true, true);
        Roupa calcaImportM2 = roupaFactory.getRoupa("m","calca", true, true);
        Roupa calcaImportM3 = roupaFactory.getRoupa("m","calca", true, true);
        Roupa blusaImportM = roupaFactory.getRoupa("m","blusa", false, true);

        System.out.println(tamanhoM.get(0).toString());
        System.out.println(tamanhoM.get(1).toString());



        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));


    }
}
