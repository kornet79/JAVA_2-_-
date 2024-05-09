package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // UP케스팅
        Parent parent2 = child; // 업케스팅 생략가능.
        //자식을 부모 타입으로 바꿔주는 것
        // 생각보다 적은 재약으로 인해 마음대로 사용가능
        parent1.parentMethod();
        parent1.parentMethod();
    }
}
