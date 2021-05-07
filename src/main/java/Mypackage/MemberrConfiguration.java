package Mypackage;


import hello2.core.member.MemberRepository;
import hello2.core.member.MemberService;
import hello2.core.member.MemberServiceImpl;

import hello2.core.member.MysqlMemberSave;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberrConfiguration {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MysqlMemberSave();
    }


}
