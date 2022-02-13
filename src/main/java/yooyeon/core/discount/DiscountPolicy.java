package yooyeon.core.discount;

import yooyeon.core.member.domain.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
