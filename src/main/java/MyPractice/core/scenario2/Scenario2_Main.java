package MyPractice.core.scenario2;

import MyPractice.core.scenario2.member.Grade;
import MyPractice.core.scenario2.member.Member;
import MyPractice.core.scenario2.member.MemberService;

public class Scenario2_Main {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.find(1L);
        System.out.println("findMember = " + findMember);



    }
}
