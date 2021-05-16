package MyPractice.core.scenario3;

import MyPractice.core.scenario3.discount.DiscountPolicy;
import MyPractice.core.scenario3.discount.RateDiscountPolicy;
import MyPractice.core.scenario3.member.MemberRepository;
import MyPractice.core.scenario3.member.MemberService;
import MyPractice.core.scenario3.member.MemberServiceImpl;
import MyPractice.core.scenario3.member.MemoryMemberRepository;
import MyPractice.core.scenario3.order.OrderService;
import MyPractice.core.scenario3.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DiscountPolicy discountPolicy() {
        System.out.println("call discountpolicy...");
        return new RateDiscountPolicy();
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call memberRepository...");
        return new MemoryMemberRepository();
    }

    @Bean
    public MemberService memberService(){
        System.out.println("call memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService(){
        System.out.println("call orderSerivce...");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }





}
