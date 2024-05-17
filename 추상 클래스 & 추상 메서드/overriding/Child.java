package poly.overriding;

public class Child extends Parent {

    public  String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }

    // 상황에 따라 부모에 상속을 다르게 받을수있다.
}
