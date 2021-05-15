package MyPractice.core.scenario2.member;

public interface MemberRepository {

    void save(Member member);
    Member find(Long userid);


}
