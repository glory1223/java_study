package ch03.sec01;

public class IncDecOperExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        System.out.println("x=" + x);
        ++x;
        System.out.println("x=" + x);
        y--;
        System.out.println("y=" +y);
        --y;
        System.out.println("y=" + y );
        System.out.println("========================");

        //선대입 후증가(z에 값을 대입 후 x값을 증가시킨다)
        //후위연산자 변수에 대입할때 주의
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("아스날 3:1 리버풀");
        System.out.println("나는 탈맹한 콥이다. 하하하");

        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
