package ku.cs.kafe.repository;

import ku.cs.kafe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {
    // SELECT * FROM Member WHERE username = 'username'
    Member findByUsername(String username);
}
//Peerasit Ployaram 6410451237