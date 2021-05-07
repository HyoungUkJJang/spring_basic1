package hello2.core.member;

// 클라이언트 역할
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
