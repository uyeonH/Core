package yooyeon.core.singleton;

public class StatefulService {
    //private int price; // 무상태로 쓸것!!!

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);

        return price;
    }


}
