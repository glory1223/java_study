package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire; // hankoor.SnowTire 패키지에 있는 Tire 객체를 사용하기 위해서.
import ch06.sec12.hankook.Tire;


import ch06.sec12.kumho.*; // import ch06.sec12.kumho.AllSeasonTire;  //import ch06.sec12.kumho.RainTire;
import ch06.sec12.kumho.project.*; // kumho 패키지에 있는 클래스도 사용해야 하고 kumho.project 패키지에 있는 클래스도 사용해야 한다면 아래와 같이 import합니다.



public class Car {
    Test t = new Test();
    Tire tire1 = new Tire(); //import를 사용하여 타 패키지의 객체를 생성해준다.
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire(); // 클래스명이 동일한경우 경로까지 명시하여 객체 생성을 해줄수 있다. (사실 import보단 명시적으로 객체생성을 해주는게 좋다.)

//    컨트롤 + 스페이스바
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
    RainTire tire5 = new RainTire();
}
