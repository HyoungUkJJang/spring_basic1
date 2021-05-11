package MyPractice.core.scenario1.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member find(Long memberid) {
        Member member = memberRepository.find(memberid);
        return member;
    }
}
