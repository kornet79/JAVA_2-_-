package poly.ex5;

public class Child implements InterfaceA,InterfaceB{
    @Override
    public void mothodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }

    @Override
    public void mothodB() {
        System.out.println("Child.methodB");
    }
}
