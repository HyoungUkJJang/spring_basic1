package hello.core.xml;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.support.GenericXmlContextLoader;

public class XmlAppContext {

    @Test
    void xmlAppContext(){
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        Object memberSerivce = ac.getBean("memberService", MemberService.class);
        Assertions.assertThat(memberSerivce).isInstanceOf(MemberService.class);



    }
}
