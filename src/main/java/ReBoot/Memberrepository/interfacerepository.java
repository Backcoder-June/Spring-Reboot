package ReBoot.Memberrepository;

import ReBoot.Memberdomain.Member;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface interfacerepository {

    Member save(Member member);

    Optional<Member>findByName(String name);

    Optional<Member>findById(Long id);

    List<Member> findAll();
}
