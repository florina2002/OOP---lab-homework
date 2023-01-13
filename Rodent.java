public class Rodent {
    private int height;

    private String color;

    private String name;

    public Rodent(String color, int height, String name){
        this.color = color;
        this.height = height;
        this.name = name;
    }

    public void getDetails(){
        System.out.println("My color is: " + this.color + " and my height is: " + this.height);
    }

    public void getFood(){
        System.out.println("I eat nuts.");
    }

    public void getName(){
        System.out.println("I am a " + name);
    }

    public void getActivity(){
        System.out.println("I like nut finding.");
    }
}
