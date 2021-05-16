package MyPractice.core.scenario3;

import MyPractice.core.scenario3.member.Grade;
import MyPractice.core.scenario3.member.Member;
import MyPractice.core.scenario3.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Scenario3_Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        MemberService memberService2 = ac.getBean(MemberService.class);
//        Member member = new Member(1L, "memberA", Grade.VIP);
//        memberService.join(member);
//        Member member1 = memberService.find(member.getId());
//        System.out.println("member1 = " + member1.getName());




    }
}
