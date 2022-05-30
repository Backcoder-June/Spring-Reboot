package ReBoot.Controller;

import ReBoot.Memberdomain.Member;
import ReBoot.Memberservice.Memberservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private final Memberservice memberservice;

    @Autowired
    public MemberController(Memberservice memberservice) {
        this.memberservice = memberservice;
    }


    @GetMapping("/members/new")
    public String Joinpage(){
        return "members/Joining";
    }

    @PostMapping("/members/new")
    public String applying(memberform form){
        Member member = new Member();

         member.setName(form.getName());
         memberservice.Join(member);
         return "redirect:/";
    }

    @GetMapping("/members")
    public String memeberlist(Model model){
        List<Member> members = memberservice.findmembers();
        model.addAttribute("members", members);
        return "members/memberList";

    }



}
