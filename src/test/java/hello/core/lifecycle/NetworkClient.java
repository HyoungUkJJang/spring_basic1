package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// 빈 생명주기 방법1 : InitializingBean, DisposableBean을 상속받고 메소드를 구현 의존관계 주입이 끝난 뒤에 실행한다. 종료시에는 디스토리 메소드로 끝
// 하지만 방법1은 오래되서 권장하지 않고 잘 쓰이지 않는다 지금은 !
// 빈 생명주기 방법2 : @Bean 어노테이션에 @Bean(initmethod="init",destoryMethod="close") 방식으로 달아주기
// 방법2 distoryMethod는 추론 기능이 있어서 굳이 적지 않아도 close , shutdown 등의 메소드를 알아서 찾아서 동작시켜준다 만약에 닫기 싫다면 ""공백으로 주면 된다.
// 빈 생명주기 방법3(이걸 사용하면 된다) : @PostConstruct / @PreDestory
public class NetworkClient  {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출 url : "+url);

    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작시 호출
    public void connect(){
        System.out.println("connect url : "+url);

    }

    // 서비스 콜
    public void call(String message){
        System.out.println("call :" + url + " message : " + message);
    }

    // 서비스 종료시
    public void disconnect(){
        System.out.println("close "+url);
    }

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메세지");
    }

    @PreDestroy
    public void close()  {
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
