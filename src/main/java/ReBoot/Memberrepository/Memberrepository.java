package ReBoot.Memberrepository;

import ReBoot.Memberdomain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Repository
public class Memberrepository implements interfacerepository{


    private static Map<Long, Member> store = new HashMap<>();

    private static long sequence = 0L;

    public void clearman(){
        store.clear();
    }





    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findByName(String name) {

        return store.values().stream().filter(member -> member.getName().equals(name)).findAny();

    }

    @Override
    public Optional<Member> findById(Long id) {

        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Member> findAll() {

        return new ArrayList<Member>(store.values());
    }
}
