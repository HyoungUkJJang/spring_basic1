package hello.core.singleton;

// 실무에서 자주등장하는 문제
public class StatefulService {

 //   private int price; //상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
//        this.price = price; 이게문제지
        return price; // 최대한 무상태로 설계를 해야한다 ! 돈과 관련된 부분의 서비스는 정말 중요함
    }

/*    public int getPrice() {
        return price;
    }*/
}
