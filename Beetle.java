public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    private String sound = "[]...[]...[]...";

    public Beetle() {
        setSound(sound);
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

}
