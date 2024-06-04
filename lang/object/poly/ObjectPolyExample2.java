package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // 오브젝트 도 인스턴스 로 만들수 있

        Object[] objects  = {dog,car,object};
    }
        private static void size(Object[] objects) {
            System.out.println("전달된 객체의 수 : " + objects.length);
        }
}
