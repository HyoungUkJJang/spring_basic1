package MyPractice.core.scenario6.member;

public interface MemberRepository {

    void save(Member member);
    Member find(Long userid);


}
