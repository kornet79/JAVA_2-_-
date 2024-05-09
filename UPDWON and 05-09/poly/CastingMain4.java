package poly.basic;

public class CastingMain4 {
// 다운 캐스팅은 잘못하면 심각한 런타임 오류가 발생할 수 있다!!!!
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();
        // 메모리 공간에서 Parent만 있기 때문에 child 를 사용할수가 없다.
        // 조심조심이 해서 사용하거라 zzz
        // 부모를 자식 클래스로 임시 캬스팅 했기 떄문이다.

    }
}
