package ReBoot;


//import ReBoot.AOP.TimetraceAOP;
import ReBoot.Memberrepository.interfacerepository;
import ReBoot.Memberservice.Memberservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    //spring data JPa config - 바로 service - repository 연결
    private final interfacerepository interfaceRepository;

    @Autowired
    public SpringConfig(interfacerepository interfaceRepository)
    {this.interfaceRepository = interfaceRepository;}

    @Bean
    Memberservice memberservice(){
        return new Memberservice(interfaceRepository);
    }

    /**JPA configuration - Entity Manager**/
    /*
    private final EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

     /*
    @Bean
    public Memberservice memberservice(){
        return new Memberservice(interfacerepository());
   }


   @Bean
    public interfacerepository interfacerepository(){
      // return new Memberrepository();
       return new JPAmemberrepository(em);

    }
*/
/*      //AOP class 직접 Bean 등록 - 하나 더 작업 해줘야한다.
    @Bean
    public TimetraceAOP timetraceAOP(){
        return new TimetraceAOP();
    }
*/

}
