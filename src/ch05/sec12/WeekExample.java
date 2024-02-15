package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        //Week 열거타입 변수 선언
        int a = 1;
        Week today = null; // null -> 아무것도 참조안함
        // today = Week.MONDAY; //Week타입 변수에 저장할수있는 값을 가져옴.

        Calendar cal =Calendar.getInstance(); // 날짜 정보를 제공해주는 객체
        int week = cal.get(Calendar.DAY_OF_WEEK); //일(1)~ 월(2)~토(7)
        System.out.println(week);

        switch (week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        System.out.println(today);

        if(today == Week.SUNDAY) {
            System.out.println("일요일에는 쉽니다.");
        } else {
            System.out.println("자바 공부를 합니다.");
        }

    }
}
