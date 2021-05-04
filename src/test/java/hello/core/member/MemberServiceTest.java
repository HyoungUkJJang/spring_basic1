package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.ObjectAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// DI OCP를 위반하는 자바코드.. 고민해보자
public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    // 테스트 코드 작성하는것은 필수다..
    @Test
    void join() {
        //given
        Member member = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(member);

        //when
        Member findMember = memberService.findMember(1L);


        //then
       Assertions.assertThat(member).isEqualTo(findMember);
    }

}
