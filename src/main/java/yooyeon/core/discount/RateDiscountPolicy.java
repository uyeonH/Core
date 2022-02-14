package yooyeon.core.discount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import yooyeon.core.annotation.MainDiscountPolicy;
import yooyeon.core.member.domain.Grade;
import yooyeon.core.member.domain.Member;

@Component
// @Primary // DiscountPolicy 중 우선권을 가짐
//@Qualifier("mainDiscountPolicy")
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }else{
            return 0;
        }
    }
}
