package hello.core.scope;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PrototypeTest {

    @Test
    void prototypeBeanFind(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(prototypeBean.class);
        System.out.println("프로토타입 빈 찾기 1번");
        prototypeBean prototypeBean1 = ac.getBean(prototypeBean.class);
        System.out.println("프로토타입 빈 찾기 2번");
        prototypeBean prototypeBean2 = ac.getBean(prototypeBean.class);

        System.out.println("prototypeBean1 = " + prototypeBean1);
        System.out.println("prototypeBean2 = " + prototypeBean2);

        Assertions.assertThat(prototypeBean1).isNotSameAs(prototypeBean2);

        ac.close(); //클로즈가 안된다 prototypeBean1.destory() 방식으로 수작업으로 종료시켜줘야함
    }

    @Scope("prototype")
    static class prototypeBean{
        @PostConstruct
        public void init(){
            System.out.println("프로토타입빈 초기화");

        }

        @PreDestroy
        public void destory(){
            System.out.println("프로토타입 빈 종료");

        }
    }
}
