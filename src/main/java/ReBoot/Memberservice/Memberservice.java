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
    private final interfacerepository interfaceRepository;

    public Memberservice(interfacerepository interfaceRepository) {
        this.interfaceRepository = interfaceRepository;
    }


    public Long Join(Member member){

        PreventSameName(member);

        interfaceRepository.save(member);
        return member.getId();
    }

    private void PreventSameName(Member member) {
        interfaceRepository.findByName(member.getName()).ifPresent(member1 ->
        {throw new IllegalStateException("이미 존재하는 회원입니다.");});
    }


    public List<Member> findmembers(){
        return interfaceRepository.findAll();
    }

    public Optional<Member> findone(Long memberid){
        return interfaceRepository.findById(memberid);
    }

//
}