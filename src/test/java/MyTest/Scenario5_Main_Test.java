package MyTest;

import MyPractice.core.scenario5.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Scenario5_Main_Test {

    @Autowired
    public void noBean(Member member)
    {
        System.out.println("member = " + member);
    }

    @Test
    @DisplayName("빈 설정 테스트")
    void BeanTest(){

    }
}
