package hello.core.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
@Scope(value = "request")
public class MyLogger {

    private String uuid;
    private String requestURL;

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }
    public void log(String message){
        System.out.println("["+uuid+"]"+"["+requestURL+"]"+"["+message+"]");
    }

    @PostConstruct
    public void init(){
        uuid = UUID.randomUUID().toString();

        System.out.println("["+uuid+"] 리퀘스트 스코프 빈 크리에이트 " + this );

    }

    @PreDestroy // 리퀘스트 스코프는 호출이된다.
    public void close(){
        System.out.println("["+uuid+"] 리퀘스트 스코프 빈 클로즈 " + this );

    }
}
