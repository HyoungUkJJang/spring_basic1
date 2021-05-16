package MyTest;

import MyPractice.core.scenario4.AutoAppConfig;
import MyPractice.core.scenario4.member.Member;
import MyPractice.core.scenario4.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Scenario4_Main_Test {

    @Test
    @DisplayName("시나리오4 테스트해보가")
    void basicScan() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);

        //System.out.println("memberService = " + memberService);
    }

}
