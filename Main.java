public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[5];
        rodents[0] = new Rodent("brown",4, "Rodent");
        rodents[1] = new Mouse("black and white",7);
        rodents[2] = new Squirrel("red",3);
        rodents[3] = new Hamster("gray",6);
        rodents[4] = new Squirrel("brown",3);

        for (Rodent rodent : rodents) {
            rodent.getName();
            rodent.getDetails();
            rodent.getFood();
            rodent.getActivity();
            System.out.println();
        }
    }
}