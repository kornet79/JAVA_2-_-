package access.a;

public class AccessInnerMian {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defauldMethod();

        // 외부 클래스는 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
