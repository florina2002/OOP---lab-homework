public class Mouse extends Rodent{
    public Mouse(String color, int height){
        super(color, height, "Mouse");
    }

    @Override
    public void getFood(){
        System.out.println("I eat cheese");
    }

    @Override
    public void getActivity(){
        System.out.println("I don't like cats");
    }
}
