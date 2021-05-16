package MyPractice.core.scenario4.member;

public interface MemberRepository {

    void save(Member member);
    Member find(Long userid);


}
