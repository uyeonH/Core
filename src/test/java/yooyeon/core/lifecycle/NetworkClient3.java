package yooyeon.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 빈 등록 초기화, 소멸 메서드
 */
public class NetworkClient3 {

    private String url;

    public NetworkClient3() {
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

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient3.init");
    }

    // 서비스 종료시 호출
    @PreDestroy
    public void close() {
        System.out.println("NetworkClient3.close");
    }

}
