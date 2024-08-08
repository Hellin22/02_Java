package ohgiraffers.section01.method;

public class Application3 {

    static int global = 20;

    /* 수업목표. 메서드 전달인자(argument)와 매개변수(parameter)에 대해 이해하고 메서드 호출 시 활용할 수 있다. */

    public static void main(String[] args) {

        /* 필기.
         *   변수를 선언한 위치에 따라 구분할 수 있다.
         *   1. 지역변수
         *   2. 전역변수
         *   3. 매개변수
         * */

        int local = 20;
        System.out.println("global 출력: " + global);
        System.out.println("local 출력: " + local);

        /* 설명. testMethod에 나이를 주고 출력하기 */
        Application3 app = new Application3();
        app.testMethod(13);
        app.testMethod(19);
        app.testMethod(15);
        app.testMethod('a');
        app.testMethod((int) 12.34);
//        app.testMethod(12.34);
        app.testMethod(3 * 6);
        app.testMethod(global * local);
    }

    /* 설명. 정수형 나이를 주면 문자열을 출력해주는 기능이 있는 메서드 */
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}