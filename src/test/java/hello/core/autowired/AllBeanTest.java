package hello.core.autowired;

import hello.core.AutoAppConfig;
import hello.core.discount.DiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * 클라이언트 선택에 따른 빈을 조회하고 싶을때는 맵으로 구현하여 해당 이름을 불러와 처리하는 방식으로 한다면 매우 편리하다
 */

public class AllBeanTest {

    @Test
    void findAllBean(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class, DiscountService.class);
        DiscountService bean = ac.getBean(DiscountService.class);
        Member member = new Member(1L, "userA", Grade.VIP);

        int price = bean.discount(member,1000,"fixDiscountPolicy");
        Assertions.assertThat(bean).isInstanceOf(DiscountService.class);
        Assertions.assertThat(price).isEqualTo(1000);

        int ratePrice = bean.discount(member, 20000, "rateDiscountPolicy");
        Assertions.assertThat(ratePrice).isEqualTo(2000);

    }


    static class DiscountService {

        private final Map<String, DiscountPolicy> discountPolicyMap;
        private final List<DiscountPolicy> policies;

        @Autowired
        public DiscountService(Map<String, DiscountPolicy> discountPolicyMap, List<DiscountPolicy> policies) {
            this.discountPolicyMap = discountPolicyMap;
            this.policies = policies;

            System.out.println("discountPolicyMap = " + discountPolicyMap);
            System.out.println("policies = " + policies);
        }
        public int discount(Member member,int price,String DiscountCode){

            DiscountPolicy discountPolicy = discountPolicyMap.get(DiscountCode);

            return discountPolicy.discount(member, price);
        }
    }

}

