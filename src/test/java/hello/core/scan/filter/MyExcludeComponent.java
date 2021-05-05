package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 타입은 클레스레벨이 붙는다. 타겟이중요
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {

    

}
