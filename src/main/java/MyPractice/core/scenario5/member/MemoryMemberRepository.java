package MyPractice.core.scenario5.member;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> memberMap = new HashMap<>();

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
