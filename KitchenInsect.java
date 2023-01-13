public class KitchenInsect extends Insect{
    private int k = printInit("KitchenInsect.k initialized");

    private String sound = "z..z..z..zzz...";

    public KitchenInsect() {
        setSound(sound);
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static KitchenInsect.x2 initialized");

}
