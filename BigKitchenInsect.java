public class BigKitchenInsect extends KitchenInsect {
    private int k = printInit("BigKitchenInsect.k initialized");

    private String sound = "Z..Z..Z..ZZZ...";

    public BigKitchenInsect() {
        setSound(sound);
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static BigKitchenInsect.x2 initialized");

}
