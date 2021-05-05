package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService bean1 = ac.getBean(StatefulService.class);
        StatefulService bean2 = ac.getBean(StatefulService.class);

        // 스레드A A사용자가 10000원주문
        int user1 = bean1.order("userA", 10000);
        // 스레드B B사용자가 20000원주문
        int user2 =bean2.order("userB", 20000);

        // 사용자 A가 주문 금액 조회
        //int price = bean1.getPrice();
        System.out.println("price = " + user1);

        //Assertions.assertThat(bean1.getPrice()).isEqualTo(20000);

    }

    static class TestConfig{
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();

        }
    }
}