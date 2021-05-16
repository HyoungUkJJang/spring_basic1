package MyPractice.core.scenario2;

import MyPractice.core.scenario2.discount.DiscountPolicy;
import MyPractice.core.scenario2.discount.RateDiscountPolicy;
import MyPractice.core.scenario2.member.MemberRepository;
import MyPractice.core.scenario2.member.MemberService;
import MyPractice.core.scenario2.member.MemberServiceImpl;
import MyPractice.core.scenario2.member.MemoryMemberRepository;
import MyPractice.core.scenario2.order.OrderService;
import MyPractice.core.scenario2.order.OrderServiceImpl;

public class AppConfig {


    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public MemberService memberService(){
      return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }





}
