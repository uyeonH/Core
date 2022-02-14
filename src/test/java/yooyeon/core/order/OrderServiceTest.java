package yooyeon.core.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import yooyeon.core.config.AppConfig;
import yooyeon.core.member.domain.Grade;
import yooyeon.core.member.domain.Member;
import yooyeon.core.member.service.MemberService;

import static org.assertj.core.api.Assertions.assertThat;

class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

    @Test
    void fieldInjectionTest() {
       // OrderServiceImpl orderService = new OrderServiceImpl();
        //orderService.createOrder(1L,"itemA",1000);
    }

}