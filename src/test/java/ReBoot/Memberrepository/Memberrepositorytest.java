package ReBoot.Memberrepository;

import ReBoot.Memberdomain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Memberrepositorytest {

    Memberrepository memberrepository = new Memberrepository();

    @AfterEach
    public void aftereach(){
        memberrepository.clearman();}

    @Test
    public void save(){
        Member member = new Member();
        member.setName("June");
        memberrepository.save(member);

        Member member1 = memberrepository.findById(member.getId()).get();
        System.out.println(member==member1);
        Assertions.assertEquals(member, member1);
        assertThat(member).isEqualTo(member1);}

    @Test
    public void findByName(){
        Member member = new Member();
        member.setName("June");
        memberrepository.save(member);

        Member b = new Member();
        b.setName("June");
        memberrepository.save(b);

        Member member1 = memberrepository.findByName(member.getName()).get();
        assertThat(member1.getName()).isEqualTo("June");

        assertThat(memberrepository.findByName(member.getName())).isEqualTo
                (memberrepository.findByName(b.getName()));
    }

    @Test
    public void findAll() {
        Member member = new Member();
        member.setName("June");
        memberrepository.save(member);

        Member member1 = new Member();
        member.setName("Tom");
        memberrepository.save(member1);

        assertThat(memberrepository.findAll().size()).isEqualTo(2);
    }
    @Test
    public void findById(){
        Member m1 = new Member();
        m1.setName("June");
        memberrepository.save(m1);

        Member m2 = new Member();
        m2.setName("Tom");
        memberrepository.save(m2);

        Member m3 = new Member();
        m3.setName("Luna");
        memberrepository.save(m3);

        Member member2 = memberrepository.findById(m2.getId()).get();
        Member member3 = memberrepository.findById(m2.getId()).get();
        assertThat(member2).isEqualTo(member3);
    }











//
}
