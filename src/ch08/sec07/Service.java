package ch08.sec07;

public interface Service {
    //default 메소드
     default void defaultMethod1() {
         System.out.println("defaultCommonMethod1() 메소드");
         defaultCommon();
     }
     default void defaultMethod2() {
         System.out.println("defaultCommonMethod2() 메소드");
         defaultCommon();
     }

    // 인터페이스에 인스턴스이면서 private 접근제한자 메소드 작성 (인터페이스 안 다른 메소드에서 가져다 쓰기 위해 많이 사용= 중복된코드를 줄임)
    private void defaultCommon() {
        System.out.println("defaultCommon() 메소드");
    }


    //정적메소드
    static void staticMethod1() {
        System.out.println("staticMethod1() 메소드");
        staticCommon();
    }
    static void staticMethod2() {
        System.out.println("staticMethod2() 메소드");
        staticCommon();
    }

    //(인터페이스 안 다른 메소드에서 가져다 쓰기 위해 많이 사용= 중복된코드를 줄임)
    // static 메소드 안에서는 static메소드만 호출가능 하므로 static 키워드 사용.
    private static void staticCommon() {
        System.out.println("staticCommon() 메소드");
    }
}
