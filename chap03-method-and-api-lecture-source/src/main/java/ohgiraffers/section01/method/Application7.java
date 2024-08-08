package ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메서드를 활용할 수 있다. */
        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();

        /* 설명. 덧셈 */
        System.out.println("두수의 합은? " + cal.plusTwoNumbers(first, second));

        /* 설명. 최소값 */
        System.out.println("두 수 중 작은 값은? " + cal.minNumbersOf(first, second));

        /* 설명. 최대값 */
        System.out.println("두 수 중 큰 값은? " + cal.maxNumbersOf(first, second));
        System.out.println("두 수 중 큰 값은? (static 메서드) " + Calculator.maxNumbersOf(first,second));
    }
}
