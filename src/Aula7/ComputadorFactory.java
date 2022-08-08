package Aula7;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {
    private static Map<String, Computer> macFlyweight = new HashMap<>();
    public Computer getComputer(int ram, int disco){
        String id = "id " + ram + " : " + disco;
        System.out.println(id);

        if (!macFlyweight.containsKey(id)){
            macFlyweight.put(id, new Computer(ram, disco));
            System.out.println("\npc criado com sucesso");
            return  macFlyweight.get(id);
        }
        System.out.println("\npc obtido");
        return macFlyweight.get(id);
    }
}
