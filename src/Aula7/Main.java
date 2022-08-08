package Aula7;

public class Main {
    public static void main(String[] args) {
        ComputadorFactory computadorFactory = new ComputadorFactory();
        Computer computer1 = computadorFactory.getComputer(16,500);
        Computer computer2 = computadorFactory.getComputer(2,256);
        Computer computer3 = computadorFactory.getComputer(16,500);


        System.out.println(computer3.toString());
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}
