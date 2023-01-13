public class Hamster extends Rodent{
    public Hamster(String color, int height){
        super(color, height, "Hamster");
    }

    @Override
    public void getFood(){
        System.out.println("I eat wallnuts");
    }

    @Override
    public void getActivity(){
        System.out.println("I like dying in the stupidest ways");
    }
}
