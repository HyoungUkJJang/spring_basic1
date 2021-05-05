package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 앱전반에 대한 모든 생성을 여기서 담당할 수 있도록 해준다.
// 스프링 기반으로 변경할땐 어노테이션이 붙는다.
@Configuration
public class AppConfig {

/*    public MemberRepository memberRepository()
    {
        return new MemoryMemberRepository();
    }*/
    // 들어가보면 MemoryMemberRepository를 구현체를 직접 생성하고있다. 정리가필요함
    @Bean
    public MemberService memberService()
    {
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService()
    {
        return new OrderServiceImpl(discountPolicy(), memberRepository());
    }
    @Bean
    public DiscountPolicy discountPolicy()
    {
       // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
