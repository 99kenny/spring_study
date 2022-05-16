package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public interface MemberRepository {
    public void save(Member member);
    public Member findById(Long memberId);
}
