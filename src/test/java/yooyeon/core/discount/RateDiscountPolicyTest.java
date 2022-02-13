package yooyeon.core.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yooyeon.core.member.domain.Grade;
import yooyeon.core.member.domain.Member;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 할인 10%")
    void vip_o() {
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        int discount = discountPolicy.discount(member, 10000);
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP 아닌 경우")
    void vip_x(){
        Member member = new Member(1L, "memberBASIC", Grade.BASIC);
        int discount = discountPolicy.discount(member, 10000);
        Assertions.assertThat(discount).isEqualTo(0);
    }
}