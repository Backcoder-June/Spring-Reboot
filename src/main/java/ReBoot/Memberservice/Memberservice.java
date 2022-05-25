package ReBoot.Memberservice;

import ReBoot.Memberdomain.Member;
import ReBoot.Memberrepository.interfacerepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//@Service
@Transactional
public class Memberservice {


  //  @Autowired
    private final interfacerepository interfacerepository;

    public Memberservice(ReBoot.Memberrepository.interfacerepository interfacerepository) {
        this.interfacerepository = interfacerepository;
    }


    public Long Join(Member member){

        PreventSameName(member);

        interfacerepository.save(member);
        return member.getId();
    }

    private void PreventSameName(Member member) {
        interfacerepository.findByName(member.getName()).ifPresent(member1 ->
        {throw new IllegalStateException("이미 존재하는 회원입니다.");});
    }


    public List<Member> findmembers(){
        return interfacerepository.findAll();
    }

    public Optional<Member> findone(Long memberid){
        return interfacerepository.findById(memberid);
    }

//
}