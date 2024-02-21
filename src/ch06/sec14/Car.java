package ch06.sec14;

public class Car {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {

        if(speed < 0) {
            //speed가 0미만이면 필드의 값을 0으로 변경
            this.speed = speed;
            return; // 메소드를 끝낸나
        } else {
            //speed가 0이면 필드의 값을 매개변수 speed 값으로 변경
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;

        //차가 멈추면 speed를 0으로만듬
        if(stop) this.speed =0;
    }
}
