package MyPractice.core.scenario4;

import MyPractice.core.scenario4.discount.DiscountPolicy;
import MyPractice.core.scenario4.discount.RateDiscountPolicy;
import MyPractice.core.scenario4.member.MemberRepository;
import MyPractice.core.scenario4.member.MemberService;
import MyPractice.core.scenario4.member.MemberServiceImpl;
import MyPractice.core.scenario4.member.MemoryMemberRepository;
import MyPractice.core.scenario4.order.OrderService;
import MyPractice.core.scenario4.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class AppConfig {

    public DiscountPolicy discountPolicy() {
        System.out.println("call discountpolicy...");
        return new RateDiscountPolicy();
    }


    public MemberRepository memberRepository() {
        System.out.println("call memberRepository...");
        return new MemoryMemberRepository();
    }

    public MemberService memberService(){
        System.out.println("call memberService");
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService(){
        System.out.println("call orderSerivce...");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }





}
