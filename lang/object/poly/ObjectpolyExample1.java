package lang.object.poly;

public class ObjectpolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object onj) {
        // 부모는 자식 메서드를 참조할 수 없다.
//        dog.sound(); 컴파일 오류, Object에서 sound()가 없다.
//        car.move(); 컴파일 오류, Object에서 move()가 없다.

        // 갹체에 맞는 다운캐스팅 필요
        if(onj instanceof Dog dog) {
            dog.sound();
        } else if(onj instanceof  Car car) {
            car.move();
        }
    }

}
