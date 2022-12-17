package zad2;

public class Wieloryb extends Ryba implements Plywanie {
    String nazwa= "Wieloryb";
    @Override
    public void plyn() {
        System.out.println(nazwa  + " Pływa");
    }

    @Override
    public void wynurz() {
        System.out.println("Wynurza się");
    }

    @Override
    public void jedz() {
        System.out.println("Papu");
    }

    @Override
    public void wydalaj() {
        System.out.println("Wydalanie");
    }

    @Override
    public void PrintName() {
        System.out.println("Nazwa: "+ nazwa);
    }

    @Override
    public void zanurz() {
        System.out.println("Zanurza się");
    }
}