public class Main {
    public static void main(String[] args) {

        Insect i1 = new Beetle();
        i1.makeSound();

        System.out.println();

        Insect i2 = new KitchenInsect();
        i2.makeSound();

        System.out.println();

        Insect i12 = new SpringBeetle();
        i12.makeSound();

        System.out.println();

        Insect i22 = new BigKitchenInsect();
        i22.makeSound();
    }
}