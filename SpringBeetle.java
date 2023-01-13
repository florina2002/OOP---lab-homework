public class SpringBeetle extends Beetle {
    private int k = printInit("SpringBeetle.k initialized");

    private String sound = "()()()()()";

    public SpringBeetle() {
        setSound(sound);
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static SpringBeetle.x2 initialized");
}
