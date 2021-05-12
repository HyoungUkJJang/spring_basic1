package MyPractice.core.scenario1.order;

import MyPractice.core.scenario1.discount.DiscountPolicy;
import MyPractice.core.scenario1.discount.FixDiscountPolicy;
import MyPractice.core.scenario1.member.Grade;
import MyPractice.core.scenario1.member.Member;
import MyPractice.core.scenario1.member.MemberRepository;
import MyPractice.core.scenario1.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public int order(Member member, String item, int price) {
        //Member member1 = new Member(1L, "memberA", Grade.VIP);

        if(member.getGrade() == Grade.VIP){
            int result = discountPolicy.disount(member, price);
            return price-result;
        }
        else{
            return price;
        }


    }
}
