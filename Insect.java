class Insect {
    private int i = 9;
    protected int j;

    private String sound = "--..--..--..";

    public Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }


    private static int x1 = printInit("static Insect.x1 initialized");

    public void setSound(String sound){
        this.sound = sound;
    }

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }

    public void makeSound() {
        System.out.println(sound);
    }
}