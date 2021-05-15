package MyPractice.core.scenario1;

import MyPractice.core.scenario1.member.*;
import MyPractice.core.scenario1.order.Order;
import MyPractice.core.scenario1.order.OrderService;
import MyPractice.core.scenario1.order.OrderServiceImpl;

public class Scenario1_Main {
    public static void main(String[] args) {
        Long memberId = 1L;
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Member member1 = new Member(1L,"memberA", Grade.BASIC);
        memberService.join(member1);

        Order result = orderService.createOrder(1L, "ice", 10000);

        System.out.println("member1 = " + member1);
        System.out.println(memberService.find(member1.getId()));
        System.out.println("member1 = " + member1.getGrade());
        System.out.println("result = " + result);

    }
   /*
   public static void main(String[] args) {


        MemberService memberService = new MemberServiceImpl();

        Member member1 = new Member(1L,"memberA", Grade.VIP);
        memberService.join(member1);

        System.out.println("member1 = " + member1);
        System.out.println(memberService.find(member1.getId()));
        System.out.println("member1 = " + member1.getGrade());
        System.out.println("member1 = " + member1.getId());



    }

    */
}
