package ch07.sec09;

public class InstancecOfExample {

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        //자동타입변환
        Person p2 = new Student("김길동", 10); //이미 여기서 자동타입변환일어남
        personInfo(p2);
    }

    public static void personInfo(Person person) { //Person person = new Student()
        System.out.println("name: " + person.name);
        person.walk();

        /*강제타입변환을 하기전에 instanceof를 사용해 타입을확인한다.
        if(person instanceof Student) { //Student클래스 타입으로 person이라는 객체가 생성되었나?
            //person이 Student 객체를 가지고 있을 경우 강제타입 변환시킬거야
            Student student = (Student) person;

            //Student 객체에 있는 필드, 메소드 사용가능
            System.out.println("studentNo: " + student.studentNo);
            student.study();
         */

        //java 12버전 이후
        if(person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }

        }
    }

