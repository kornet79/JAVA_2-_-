package poly.basic;

public class PolyMain {

    public static void main(String[] args) {

        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent - > Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        // 자식은 부모의 메소드 까지 호출할수 있다.
        // 상속이였음
        // 부모 변수가 자식 인스턴스 참조(다향적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
//        Up케스팅은 굳이 사용하지 않고 사용한다
//        부모 클래스를 형변화 시켜 자식 클래스로 치환하는것을 DWON 캐스팅이라고함
        // 부모 -> 자식을 참조 (자식의 메소드를 사용하는)
//        poly.childMethod(); 자식의 기능을 호출할 수 없다.
//        Child child1 = new Parent(); 자식은 부모를 담을수가 없다.
        // 부모는 자식음 담을수 있다.
        // 부모가 자식을 참조하는 경우에는 Child 를 생성하면 부모도 메모리에 담기긴한다.


    }

}

/*
1. 객체지향 프로그램의 대표적인 특성 : 캡술화, 상속, 다형성...
2. 다형성은 객체지향 프로그래밍의 꽃이라 불린다.
3. 다형성은 이름 그대로 '다양한 형태' '여러 형태'를 뜻한다.
4. 프로그래밍에서 다향성은 한 각체가 여러 타입의 객체로 취급될 수 있는 능력을 뜻한다.
5. 보통 하나의 객체는 하나의 타입으로 고장되어있는 대로 다향성을 사용하면 하나의 객체가 다른 타입으로 사용될수 있다는 뜻이다.

다형성 2가지 핵심 이론
1. 다향성 참조
2. 메서드 오버라이딩
 */
