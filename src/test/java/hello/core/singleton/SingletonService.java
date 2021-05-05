package hello.core.singleton;
// 싱글톤 제작 예제

/**
 * 하지만 기본적으로 만들어 둔 Appconfig를 이런방식으로 바꾸면 될거같지만 굳이 그럴 필요가없다
 * 스프링 컨테이너가 생성할때 기본적으로 싱글톤으로 만들어주기 때문..
 */
public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }
    // 생성자를 프라이빗으로 막는다
    private SingletonService() {

    }

    public void logic(){
        System.out.println("싱글톤 객체 호출");
    }
}
