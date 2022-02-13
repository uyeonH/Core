package yooyeon.core.member.service;

import yooyeon.core.member.domain.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
