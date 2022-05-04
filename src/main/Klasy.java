package main;

public class Klasy {
    public static void main(String[] args) {

        int a = 100;

        MojInterfejs m1 = new MojInterfejs() {
            int x = 10;

            @Override
            public void wyswietlTekst(String pStr) {
                System.out.println(pStr);
                System.out.println("*****");
                System.out.println(x);
                System.out.println("*****");
                System.out.println(a);
                System.out.println("*****");

            }

        };
        m1.wyswietlTekst("Witam");
        System.out.println(m1.a);
    }
}
