package MyTest;

import MyPractice.core.scenario6.member.Member;
import MyPractice.core.scenario6.AutoAppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Scenario6_Main_Test {

    @Test
    @DisplayName("조회 빈이 2개 이상일때")
    void BeanTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
    }



}
