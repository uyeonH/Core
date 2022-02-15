package yooyeon.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 빈 등록 초기화, 소멸 메서드
 */
public class NetworkClient2 {

    private String url;

    public NetworkClient2() {
        System.out.println("생성자 호출, url = " + url);
        connect();
        init();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스 시작시 호출
    public void connect() {
        System.out.println("connect: " + url);
    }

    public void init() {
        System.out.println("NetworkClient2.init");
    }

    // 서비스 종료시 호출
    public void close() {
        System.out.println("NetworkClient2.close");
    }

}
