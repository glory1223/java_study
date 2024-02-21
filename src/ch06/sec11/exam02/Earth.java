package ch06.sec11.exam02;

public class Earth {
    //상수선언
    //상수 초기화 방법 첫번째
    static final double EARTH_RADIUS = 6400; // 상수는 항상 대문자(_)
    static final double EARTH_SURFACE_AREA;

    //상수 초기화 두번쨰 방법 (정적필드)
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }

}
