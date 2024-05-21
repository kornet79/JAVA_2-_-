package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.mothodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.mothodB();
        b.methodCommon();
    }
}
