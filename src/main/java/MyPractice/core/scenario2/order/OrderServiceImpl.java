package MyPractice.core.scenario2.order;

import MyPractice.core.scenario1.discount.DiscountPolicy;
import MyPractice.core.scenario1.discount.FixDiscountPolicy;
import MyPractice.core.scenario1.member.Member;
import MyPractice.core.scenario1.member.MemberRepository;
import MyPractice.core.scenario1.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public Order createOrder(Long memberId, String itemName, int price) {
        //Member member1 = new Member(1L, "memberA", Grade.VIP);
        Member member = memberRepository.find(memberId);
        System.out.println("member = " + member);
        int discount = discountPolicy.discount(member,price);

        return new Order(memberId, itemName, price, discount);
//        return new Order(2L, "ex",10000, 1000);

    }
}
