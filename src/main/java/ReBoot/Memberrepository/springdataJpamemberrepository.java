package ReBoot.Memberrepository;

import ReBoot.Memberdomain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface springdataJpamemberrepository extends JpaRepository<Member, Long>, interfacerepository {

    @Override
    Optional<Member> findByName(String name);

    @Override
    List<Member> findAll();

    @Override
    Optional<Member> findById(Long id);

    @Override
    Member save(Member member);
}
