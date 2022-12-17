import zad1.Lata;
import zad1.Plywa;
import zad1.Samolot;
import zad1.Statek;
import zad2.Ryba;
import zad2.Wieloryb;
import zad2.Zwierze;

public class Zadania {
    public static void Zadanie1() {
        Lata latajacy = new Samolot();
        Plywa plywa = (Plywa) new Statek();

        plywa.Plyn();
        latajacy.Lec();
    }

    public static void Zadanie2() {
        Zwierze wieloryb = new Wieloryb();
        wieloryb.PrintName();

        var ryba = (Ryba)wieloryb;
        ryba.wydalaj();
        ryba.jedz();
        ryba.wydalaj();
    }
}
