package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);

    }

    static class TestBean {
        // 1 오토와이어드 required = false 자동주입 대상이 없으면 호출안됨 기본값은 트루
        // 펄스로 해주면 호출이안된다 맴버는 스프링이 관리하는 빈이 아니기때문에 애초에 호출을 하지않는다
        @Autowired(required = false)
        public void setNoBean(Member member)
        {
            System.out.println("member1 = " + member);
        }

        //2
        @Autowired
        public void setNoBean2(@Nullable Member member){
            System.out.println("member2 = " + member);
        }

        //3
        @Autowired
        public void setNoBean3(Optional<Member> member)
        {
            System.out.println("member3 = " + member);
        }
    }

}
