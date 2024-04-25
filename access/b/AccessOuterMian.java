package access.b;

import access.a.AccessData;

public class AccessOuterMian {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public
        data.publicField = 1;
        data.publicMethod();

//        // default - 다른 패키지이므로 호출 불가.
//        data.defaultField = 2;
//        data.defauldMethod();

        // 외부 클래스는 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
