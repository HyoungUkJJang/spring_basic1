package MyTest;

import MyPractice.core.scenario3.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력해보기")
    void findAllBean(){
        for(String beanName : ac.getBeanDefinitionNames())
        {
            Object bean = ac.getBean(beanName);
            System.out.println("bean = " + bean);
        }
    }


}
