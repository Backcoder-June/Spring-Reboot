package ReBoot.Memberservice;


import ReBoot.Memberdomain.Member;
import ReBoot.Memberrepository.Memberrepository;
import ReBoot.Memberrepository.interfacerepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@Transactional
class MemberserviceintTest {
    @Autowired
    Memberservice memberservice;
    @Autowired
    interfacerepository memberrepository;

    /*@BeforeEach
    public void beforeeach(){
        memberrepository = new Memberrepository();
        memberservice = new Memberservice(memberrepository); }
*/
 /*   @AfterEach
    public void aftereach(){
        memberrepository.clearman();}
*/

    @Test
    //@Commit
    void join() {
        Member member = new Member();
        member.setName("June");
        Long result = memberservice.Join(member);

        Member m2 = new Member();
        m2.setName("Tom");

        /*IllegalStateException at = assertThrows(IllegalStateException.class, () -> memberservice.Join(m2));
        assertThat(at.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
*/
        try {
           Long result2 = memberservice.Join(m2);}
     //  fail("예외가 발생해야하는데 안발생했습니다.");}
       catch (IllegalStateException e){
           System.out.println(e.getMessage());
       assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
       }


        //assertThat(result2).isEqualTo(m2.getId());



    }

    @Test
    void findmembers() {
        Member m1 = new Member();
        m1.setName("June");
        memberservice.Join(m1);

        Member m2 = new Member();
        m2.setName("Jane");
        memberservice.Join(m2);

        Member m3 = new Member();
        m3.setName("Jack");
        memberservice.Join(m3);

        assertThat(memberservice.findmembers().size()).isEqualTo(3);

    }

}