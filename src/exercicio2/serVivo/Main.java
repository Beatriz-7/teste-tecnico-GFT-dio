package exercicio2.serVivo;

public class Main {
    public static void main(String[] args) {
        SerVivo Animal = new Animal();
        Animal.getRespira();
        System.out.println(Animal.getRespira());
        SerVivo Vegetal = new Vegetal();
        Vegetal.getRespira();
        System.out.println(Vegetal.getRespira());

    }
}
