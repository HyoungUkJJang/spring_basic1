package hello.core.beenfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean(){
        String[] be = ac.getBeanDefinitionNames();
        //iter 하고 탭
        for (String s : be) {
            Object object = ac.getBean(s); // 타입을 모르기때문에 오브젝트로 꺼내진다.
            System.out.println("object = " + object);
            
        }
    }
    
    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        //iter 하고 탭
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
            
            // Role은 내가 생성한 애플리케이션을 개발하기위해 생성한것들만 나타내줌
            // ROLE_APPLICATION > 직접 등록한 애플리케이션 빈
            // ROLE_INFRASTRUCTURE > 스프링 내부에서 사용하는 빈
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object = " + bean);
            }
        }
    }
    
    
}
