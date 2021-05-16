package MyPractice.core.scenario5.member;

public interface MemberRepository {

    void save(Member member);
    Member find(Long userid);


}
