package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크대해 이해할 수 있다.(list부터) */
//        ArrayList list = new ArrayList(); // Object가 생략
        List list = new ArrayList<>();
        // List 계열의 다른 인스턴스로 바껴도 나머지 코드에 영향을 주지 않기 위해서 다형성을 적용한 형태로 많이 사용
        // 다형성을 적용한 코드를 주로 작성 -> 단일책임원칙 때문에
        // 쉽게 말하자면 부모로 선언하고 구현을 다양하게 바꿔 끼운다고 생각하면 된다.

        /* 설명. 자료형에 구애받지 않고 데이터를 추가할 수 있다. */
        list.add("dasfa");
        list.add(123);
        list.add(45.67);
        list.add(new java.util.Date());

        /* 설명. 컬렉션들은 toString() 오버라이딩이 잘 되어 있어 출력해보기 편함 */
        System.out.println("list 한번에 출력: " + list);

        System.out.println("list.get(2): " + list.get(2));
        System.out.println("list에 담긴 데이터의 크기: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* 설명.
         *   배열보다 ArrayList가 나은 점
         *   1. 처음부터 크기 할당 불필요
         *   2. 중간에 값 추가 및 삭제 상대적으로 용이
         * */

        /* 설명. 배열과 ArrayList를 활용해 각각 원하는 인덱스에 값 추가해보기 */
        int[] intArr = new int[5];
        int num = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = ++num;
        }

        System.out.println(Arrays.toString(intArr));

        int[] newArr = new int[intArr.length + 1];
        System.arraycopy(intArr, 0, newArr, 0, intArr.length);
        System.out.println(Arrays.toString(newArr));

        /* 설명. 2번 인덱스 위치에 7을 끼워넣기 */
        for (int i = newArr.length - 1; i >= 2; i--) {
            newArr[i] = newArr[i - 1];
        }
        newArr[2] = 7;
        System.out.println(Arrays.toString(newArr));

        /* 설명. ArrayList에서 제공하는 add */
        ArrayList<Integer> intArrList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intArrList.add(i + 1);
        }
        System.out.println(intArrList);
        intArrList.add(2, 124);         // 매개변수 2개짜리 add 메더드를 활용
        System.out.println(intArrList);

        /* 설명. ArrayList에는 중복(동등(e, h) -> equals, hashcode) 값이 허용된다. */
        System.out.println(list);
        list.add("apple");
        list.add(123);
        System.out.println(list);


        System.out.println(intArrList);
        Collections.sort(intArrList, Collections.reverseOrder());
        System.out.println(intArrList);
        intArrList.sort(Comparator.reverseOrder());
        System.out.println(intArrList);

        /* 설명. ArrayList가 관리하는 값을 수정하려면 set()메서드를 활용한다. */
        list.set(0, 777);
        System.out.println(list);

        /* 설명. ArrayList가 관리하는 값을 삭제하려면 remove() 메서드를 활용한다. */
        list.remove(0);
        System.out.println(list);

        list.add(null);
        System.out.println(list);

        /* 설명. ArrayList를 활용한 정렬 */
        /* 설명. 1. 문자열 데이터 정렬 */
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange1");
        stringList.add("orange2");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("stringList = " + stringList);
        Collections.sort(stringList, Collections.reverseOrder());
        Collections.sort(stringList);
        stringList.sort(Comparator.reverseOrder());
        stringList.sort(Comparator.naturalOrder());
        System.out.println("stringList = " + stringList);

        /* 설명. ArrayList 안에 들어있는 데이터 타입(String)에 정의된 정렬 기준대로 정렬 */
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(14124124);
        integerList.add(772);
        integerList.add(3123);
        integerList.add(6634);
        integerList.add(5123);
        System.out.println("integerList = " + integerList);

        Collections.sort(integerList);
        // 오름차순으로 정렬을 해라가 x -> Integer의 기본 compareTo가 오름차순으로 정의되어있어서 Integer의 경우 오름차순으로 정렬되는것.
        System.out.println("integerList = " + integerList);

        /* 설명. 내림차순으로 바꾸기 위해 ArrayList에서 LinkedList로 교체 */
        stringList = new LinkedList<>(stringList);

        /* 설명. Iterator(반복자)는 hasNext와 next()를 활용해 들어있는 data를 반복시킬 수 있는 타입 */
        /* 설명. 다루는 Iterator와 관련된 컬렉션의 제네릭 타입과 일치하는 제네릭을 꼭 써주자. */
        Iterator<String> iter = ((LinkedList<String>) stringList).descendingIterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
        Iterator<String> iter2 = stringList.iterator();
        while(iter2.hasNext()) {
            System.out.print(iter2.next() + " ");
        }
        stringList.sort(Comparator.naturalOrder());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(1);
        priorityQueue.add(2);
        System.out.println(priorityQueue.peek());
    }
}
