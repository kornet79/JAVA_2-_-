package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString() 은 Object 클래스이 메소드
        System.out.println(child.toString());
    }
}
