package hello.core.discount;

import hello.core.Mycode.MyRateDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy(); // 강의코드
    MyRateDiscountPolicy myRateDiscountPolicy = new MyRateDiscountPolicy(); //내가짠코드
    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void vip_o(){
        //given
        Member member = new Member(1L, "memberVip", Grade.VIP);

        //when
        int discount = myRateDiscountPolicy.discount(member, 10000);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("회원이 VIP가 아니면 할인이 적용되면 안된다.")
    void vip_x()
    {
        //given
        Member member = new Member(1L, "memberStandard", Grade.BASIC);

        //when
        int discount = rateDiscountPolicy.discount(member, 10000);

        //then
        Assertions.assertThat(discount).isEqualTo(0); // 임포트 스테틱 알아보기
    }
}