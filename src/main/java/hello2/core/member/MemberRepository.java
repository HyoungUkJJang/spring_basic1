package hello2.core.member;

// 저장소
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
