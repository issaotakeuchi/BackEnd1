package MesaAula9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoupaFactory {
    public static List<Roupa> importadas = new ArrayList<>();
    public static List<Roupa> masCondicoes = new ArrayList<>();
    public static List<Roupa> tamanhoM = new ArrayList<>();
    public static List<Roupa> tamanhoS = new ArrayList<>();
    public static List<Roupa> tamanhoXS = new ArrayList<>();
    private static Map<String, Roupa> roupaFlyweight = new HashMap<>();

    public Roupa getRoupa(String tamanho, String tipo, Boolean eNovo, Boolean importada) {
        String roupa = "roupa (tamanho: " + tamanho + ", tipo: " + tipo + ", estado (novo?): " + eNovo.toString() + ", importado: " + importada.toString() + ")";
        System.out.println(roupa);

        if (roupaFlyweight.containsKey(roupa)) {
            System.out.println("já registrado");
        } else{
        roupaFlyweight.put(roupa, new Roupa(tamanho, tipo, eNovo, importada));
        if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("m") && roupaFlyweight.get(roupa).iseNovo() == false && roupaFlyweight.get(roupa).isImportada() == true) {
            System.out.println("registrada com sucesso na lista de tamanho m, na lista de roupas em mas condicoes e na lista de importado");
            tamanhoM.add(roupaFlyweight.get(roupa));
            importadas.add(roupaFlyweight.get(roupa));
            masCondicoes.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("m") && roupaFlyweight.get(roupa).iseNovo() == false) {
            System.out.println("registrada com sucesso na lista de tamanho m e na lista de roupas em mas condicoes");
            tamanhoM.add(roupaFlyweight.get(roupa));
            masCondicoes.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("m") && roupaFlyweight.get(roupa).isImportada() == true) {
            System.out.println("registrada com sucesso na lista de tamanho m e na lista de importado");
            tamanhoM.add(roupaFlyweight.get(roupa));
            importadas.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("m")) {
            System.out.println("registrada com sucesso na lista de tamanho m");
            tamanhoM.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("s") && roupaFlyweight.get(roupa).iseNovo() == false && roupaFlyweight.get(roupa).isImportada() == true) {
            System.out.println("registrada com sucesso na lista de tamanho s, na lista de roupas em mas condicoes e na lista de importado");
            tamanhoS.add(roupaFlyweight.get(roupa));
            importadas.add(roupaFlyweight.get(roupa));
            masCondicoes.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("s") && roupaFlyweight.get(roupa).isImportada() == true) {
            System.out.println("registrada com sucesso na lista de tamanho s e na lista de importado");
            tamanhoS.add(roupaFlyweight.get(roupa));
            importadas.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("s") && roupaFlyweight.get(roupa).iseNovo() == false) {
            System.out.println("registrada com sucesso na lista de tamanho s e na lista de roupas em mas condicoes");
            tamanhoS.add(roupaFlyweight.get(roupa));
            masCondicoes.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("s")) {
            System.out.println("registrada com sucesso na lista de tamanho s");
            tamanhoS.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("xs") && roupaFlyweight.get(roupa).iseNovo() == false && roupaFlyweight.get(roupa).isImportada() == true) {
            System.out.println("registrada com sucesso na lista de tamanho xs, na lista de roupas em mas condicoes e na lista de importado");
            tamanhoXS.add(roupaFlyweight.get(roupa));
            importadas.add(roupaFlyweight.get(roupa));
            masCondicoes.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("xs") && roupaFlyweight.get(roupa).isImportada() == true) {
            System.out.println("registrada com sucesso na lista de tamanho xs e na lista de importado");
            tamanhoXS.add(roupaFlyweight.get(roupa));
            importadas.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("xs") && roupaFlyweight.get(roupa).iseNovo() == false) {
            System.out.println("registrada com sucesso na lista de tamanho xs e na lista de roupas em mas condicoes");
            tamanhoXS.add(roupaFlyweight.get(roupa));
            masCondicoes.add(roupaFlyweight.get(roupa));
        } else if (roupaFlyweight.get(roupa).getTamanho().equalsIgnoreCase("xs")) {
            System.out.println("registrada com sucesso na lista de tamanho xs");
            tamanhoXS.add(roupaFlyweight.get(roupa));
        }
        return roupaFlyweight.get(roupa);
    }
        return roupaFlyweight.get(roupa);
    }
}
