package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        // 다형성 참조
        Parent poly = new Parent();

//        poly.childMethod();

        // 다운캐스틍(부모타입 -> 자식타입)
        // 참조된 값만 임시적으로 child로 바뀐거지 원조는 페어런츠다.
        ((Child)poly).childMethod();
//        이러면 poly만 임시적으로 child값으로 만들수 있
    }
}
