package MyPractice.core.scenario1.member;


import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    Map<Long, Member> memberMap = new HashMap<>();

    @Override
    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    @Override
    public Member find(Long userid) {
        Member findMember = memberMap.get(userid);
        return findMember;
    }


}
