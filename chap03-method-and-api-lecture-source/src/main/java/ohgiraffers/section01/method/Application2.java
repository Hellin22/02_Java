package ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main() 시작함...");

        /* 설명. static이 없는 메서드(non-static method)는 해당 클래스를 인지시킨 후 접근해 호출한다.*/
        Application2 app = new Application2();
        app.methodA();
        app.methodB();
        app.methodC();
        System.out.println("main() 종료됨...");
    }

    public void methodA(){
        System.out.println("methodA() 호출됨...");
        System.out.println("methodA() 종료됨...");
    }
    public void methodB(){
        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");
    }
    public void methodC(){
        System.out.println("methodC() 호출됨...");
        System.out.println("methodC() 종료됨...");
    }
}
