public class Main {
    public static void main(String[] args) {
        ClassA ca = new ClassA();

        callInt1(ca);
        callInt2(ca);
        callInt3(ca);
        callInt4(ca);
    }

    public static void callInt1(Interface1 i){
        i.interface1Method1();
        i.interface1Method2();
    }

    public static void callInt2(Interface2 i){
        i.interface2Method1();
        i.interface2Method2();
    }

    public static void callInt3(Interface3 i){
        i.interface3Method1();
        i.interface3Method2();
    }

    public static void callInt4(Interface4 i){
        i.interface4Method();
    }
}