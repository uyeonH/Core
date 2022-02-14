package yooyeon.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import yooyeon.core.discount.RateDiscountPolicy;
import yooyeon.core.member.domain.Grade;
import yooyeon.core.member.domain.Member;
import yooyeon.core.member.repository.MemoryMemberRepository;

public class OrderServiceImplTest {

    @Test
    void createOrder() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));
        OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
