package yooyeon.core.member.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import yooyeon.core.config.AppConfig;
import yooyeon.core.member.domain.Grade;
import yooyeon.core.member.domain.Member;

import static org.assertj.core.api.Assertions.assertThat;

class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        //when
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);
        //then
        assertThat(memberA).isEqualTo(findMember);
    }

}