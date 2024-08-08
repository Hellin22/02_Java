package com.ohgiraffers.assertions.section02.assertj;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class AssertJTests {

    /* 수업목표. test 3rd party lib(남이 만든 라이브러리) 중 AssertJ의 사용법에 대해 이해할 수 있다. */

    /* 목차. 1. 문자열 테스트하기 */
    @Test
    @DisplayName("문자열 테스트")
    void testStringValidation() {

        // given
        String expected = "hello world";

        // when
        String actual = new String(expected);

        //then
        Assertions.assertThat(actual)
                .isNotEmpty()
                .isNotBlank()
                .contains("hello")
                .doesNotContain("hahaha")
                .startsWith("h")
                .endsWith("d")
                .isEqualTo("hello world");
    }

    /* 목차. 2. 숫자 테스트하기 */
    @Test
    @DisplayName("숫자 테스트하기")
    void testIntegerValidation() {
        double pi = Math.PI;
        Double actual = Double.valueOf(pi);

        Assertions.assertThat(actual)
                .isPositive()
                .isGreaterThan(3)
                .isLessThan(4)
                .isEqualTo(Math.PI);
    }

    /* 목차. 3. 날짜 테스트하기 */
    @Test
    @DisplayName("날짜 테스트하기")
    void testLocalDateTimeValidation() {
        String birthday = "2014-09-18T16:42:00.000";

        LocalDateTime theDay = LocalDateTime.parse(birthday);

        Assertions.assertThat(theDay)
                .hasYear(2014)
                .hasMonthValue(9)
                .hasMonth(Month.SEPTEMBER)
                .hasDayOfMonth(18)
                .isBetween("2014-01-01T00:00:00.000", "2014-11-13T23:59:59.999")
                .isBefore(LocalDateTime.now());
    }

    /* 목차. 4. 예외 테스트하기 */
    @Test
    @DisplayName("예외 테스트하기")
    void testExceptionValidation() {
        Throwable thrown = AssertionsForClassTypes.catchThrowable(() -> {
            throw new IllegalArgumentException("잘못된 파라미터를 입력하셨씁니다");
        });

        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("파라미터");
    }

    /* 목차. 5. filter를 이용한 단정문 테스트하기 */
    @Test
    @DisplayName("filtering assertions 테스트하기")
    void testFilteringAssertions() {
        Member member1 = new Member(1, "user01", "홍길동", 1);
        Member member2 = new Member(2, "user02", "김김1", 1);
        Member member3 = new Member(3, "user03", "김김2", 24);
        Member member4 = new Member(4, "user04", "김김4", 25);
        Member member5 = new Member(5, "user05", "김김5", 2);

        List<Member> members = Arrays.asList(member1, member2, member3, member4, member5);
        /* 설명. 3번과 4번 회원이 성인인지 확인 */
        Assertions.assertThat(members)
                .filteredOn(member -> member.getAge() > 20)
                .containsOnly(member3, member4);
        // containsOnly는 파라미터로 오는 애들만 존재한다는 의미. -> mem3, 4를 제외한 애들은 나이가 20을 넘으면 안됨.
    }

    /* 목차. 6. 객체 프로퍼티 검증하기 */
    @Test
    @DisplayName("객체의 프로퍼티 검증 테스트하기")
    void testPropertyValidation(){
        Member member1 = new Member(1, "user01", "홍길동", 1);
        Member member2 = new Member(2, "user02", "김김1", 1);
        Member member3 = new Member(3, "user03", "김김2", 24);
        Member member4 = new Member(4, "user04", "김김4", 25);
        Member member5 = new Member(5, "user05", "김김5", 2);

        List<Member> members = Arrays.asList(member1, member2, member3, member4, member5);

        Assertions.assertThat(members)
                .filteredOn("age", 25)
                .containsOnly(member4);
    }
}
