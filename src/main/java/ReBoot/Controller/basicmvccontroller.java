package ReBoot.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class basicmvccontroller {


    @GetMapping("/second")
    public String Firstmvc(Model model){
        model.addAttribute("data", "두번째 방문입니다.");
        return "basicmvc";
    }

    @GetMapping("/Third")
    public String request(@RequestParam("promise") String whatever, Model model){
        model.addAttribute("htmlkey", whatever);
        return "requestparam";
    }

    @ResponseBody
    @GetMapping("/API")
    public String api(@RequestParam("agree") String what){
        return "Hey" + what;}



   /////

    static class hellodata{
        private String jasonsaidthat;

        public String getJasonsaidthat() {
            return jasonsaidthat;}
        public void setJasonsaidthat(String jasonsaidthat) {
            this.jasonsaidthat = jasonsaidthat;}
    }

    @GetMapping("/Json")
    @ResponseBody
    public hellodata hd(@RequestParam("promise") String whatever){
        hellodata h1 = new hellodata();
        h1.setJasonsaidthat(whatever);
        return h1;
    }






}



