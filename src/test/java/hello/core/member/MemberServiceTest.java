package hello.core.member;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("MemberService 클래스의")
public class MemberServiceTest {

    private MemberService memberService = new MemberServiceImpl();

    @DisplayName("join 메서드는")
    @Nested
    class Describe_join {
        @DisplayName("만약 아이디기 중복되지 않은 멤버를 저장할 경우")
        @Nested
        class Context_with_saved_valid_member {
            @DisplayName("회원 정보를 저장한다.")
            @Test
            void join() {
                //given
                Member member = new Member(1L, "memberA", Grade.VIP);

                //when
                memberService.join(member);
                Member findMember = memberService.findMember(1L);

                //then
                assertThat(findMember).isEqualTo(findMember);
            }
        }
    }



}
