package MyPractice.core.scenario1.member;

public interface MemberRepository {

    void save(Member member);
    Member find(Long userid);


}
