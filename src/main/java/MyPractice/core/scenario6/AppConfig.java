package MyPractice.core.scenario6;

import MyPractice.core.scenario6.discount.DiscountPolicy;
import MyPractice.core.scenario6.discount.RateDiscountPolicy;
import MyPractice.core.scenario6.member.MemberRepository;
import MyPractice.core.scenario6.member.MemberService;
import MyPractice.core.scenario6.member.MemberServiceImpl;
import MyPractice.core.scenario6.member.MemoryMemberRepository;
import MyPractice.core.scenario6.order.OrderService;
import MyPractice.core.scenario6.order.OrderServiceImpl;


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
