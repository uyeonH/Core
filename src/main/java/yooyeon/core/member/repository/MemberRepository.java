package yooyeon.core.member.repository;

import yooyeon.core.member.domain.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
