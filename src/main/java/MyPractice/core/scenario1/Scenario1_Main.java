package MyPractice.core.scenario1;

import MyPractice.core.scenario1.member.*;

public class Scenario1_Main {
    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();

        Member member1 = new Member(1L,"memberA", Grade.VIP);
        memberService.join(member1);

        System.out.println("member1 = " + member1);
        System.out.println(memberService.find(member1.getId()));
        System.out.println("member1 = " + member1.getGrade());


    }
}
