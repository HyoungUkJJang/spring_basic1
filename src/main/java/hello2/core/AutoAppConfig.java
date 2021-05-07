package hello2.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 컴포넌트스캔
 */
@Configuration
@ComponentScan(
        // basePackages  ="hello.core.member", //해당 경로부터 스캔을 시작한다 이렇게 적으면 member만 적용
         // basePackageClasses =   public class AutoAppConfig 의 패키지경로 hello.core
        // 지정하지 않으면 디폴트 해당 패키지 경로부터 시작 hello.core
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = Configuration.class) // 컨피규레이션에도 컴포넌트가 붙어잇기때문에.
)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//        MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }

}
