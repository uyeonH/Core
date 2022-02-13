package yooyeon.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yooyeon.core.discount.DiscountPolicy;
import yooyeon.core.discount.FixDiscountPolicy;
import yooyeon.core.discount.RateDiscountPolicy;
import yooyeon.core.member.repository.MemoryMemberRepository;
import yooyeon.core.member.service.MemberService;
import yooyeon.core.member.service.MemberServiceImpl;
import yooyeon.core.order.OrderService;
import yooyeon.core.order.OrderServiceImpl;

@Configuration
public class AppConfig { // 팩토리 메소드 통해서 빈 등록하는 방식

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
