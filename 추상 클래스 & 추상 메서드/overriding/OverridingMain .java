package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        // 자식 변수가 자식 인스턴스 참조.
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        // 여기까지가 상속에 개념

        System.out.println();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        // 부모는 자식을 품을 수 있다!!!
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value);
        poly.method(); // 오버라이딩이게 됬기 때문에 무조건 오버라이딩이 된 메소드을 최운선으로 가져오게 된다.

    }
}
/*
1. child 변수는 Child 타입이다.
    child.value, child.method()를 호출하면 인스턴스의 Child 타입에서 기능을 찾아 실행한다.
2. parent 변수는 Parent 타입이다.
    -parent,value, parent.method()를 호출하면 인스턴스의 Parent 타입에서 기능을 찾아 실행한다.
3. poly 변수는 Parent 타입이다.
    -poly.value, poly.method()를 호출하면 인스턴스의 Parent 타입에서 기능을 찾아 실행한다.
        - poly.value : Parent 타입에 있는 value 값을 읽는다.
        - polu.method() : Parent 타입에 있는 method()를 실행할려고 한다.
         그런데 하위 타입인 Child.method() 오버라이딩이 되어 있는걸 확인한다.
        -오버라이딩 되어 있는 메서드는 항상 우선권을 가진다.
         따라서 Parent.method()가 아니라 Child.method()가 실행된다.
4. 오버라이딩은 부모 타입에서 정의한 기능을 자식 타입에서 재정의하는 것이다.
    만약에 자식에서도 오버라이딩하고 손자에서도 같은 메서드를 오버라이딩을 하면 손자의 오버라이딩 메서드가 우선권을 가진다.
 */
