public class Squirrel extends Rodent{
    public Squirrel(String color, int height){
        super(color, height, "Squirrel");
    }

    @Override
    public void getFood(){
        System.out.println("I eat peanunts");
    }

    @Override
    public void getActivity(){
        System.out.println("I like jumping from trees");
    }
}
