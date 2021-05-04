package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

// 앱전반에 대한 모든 생성을 여기서 담당할 수 있도록 해준다.
public class AppConfig {

/*    public MemberRepository memberRepository()
    {
        return new MemoryMemberRepository();
    }*/
    // 들어가보면 MemoryMemberRepository를 구현체를 직접 생성하고있다. 정리가필요함
    public MemberService memberService()
    {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService()
    {
        return new OrderServiceImpl(new FixDiscountPolicy(),new MemoryMemberRepository());
    }
}
