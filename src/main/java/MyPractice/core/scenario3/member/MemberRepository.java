package MyPractice.core.scenario3.member;

public interface MemberRepository {

    void save(Member member);
    Member find(Long userid);


}
