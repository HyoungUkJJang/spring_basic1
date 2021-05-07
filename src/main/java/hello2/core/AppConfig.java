package hello2.core;

import hello2.core.discount.DiscountPolicy;
import hello2.core.discount.RateDiscountPolicy;
import hello2.core.member.MemberRepository;
import hello2.core.member.MemberService;
import hello2.core.member.MemberServiceImpl;
import hello2.core.member.MemoryMemberRepository;
import hello2.core.order.OrderService;
import hello2.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 앱전반에 대한 모든 생성을 여기서 담당할 수 있도록 해준다.
// 스프링 기반으로 변경할땐 어노테이션이 붙는다.
@Configuration // 싱글톤을 위해 존재하는것 ..! 붙이지않으면 싱글톤 보장이 안됨 순수 자바코드로 실행이된다.
public class AppConfig {

/*    public MemberRepository memberRepository()
    {
        return new MemoryMemberRepository();
    }*/
    // 들어가보면 MemoryMemberRepository를 구현체를 직접 생성하고있다. 정리가필요함
    @Bean
    public MemberService memberService()
    {
        //System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        //System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService()
    {
        //System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(discountPolicy(), memberRepository());
    }
    @Bean
    public DiscountPolicy discountPolicy()
    {
       // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
