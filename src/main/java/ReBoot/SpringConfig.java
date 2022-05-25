package ReBoot;


import ReBoot.Memberrepository.interfacerepository;
import ReBoot.Memberservice.Memberservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    //spring data JPa config - 바로 service - repository 연결
    private final interfacerepository interfaceRepository;

    public SpringConfig(interfacerepository interfaceRepository) {
        this.interfaceRepository = interfaceRepository;
    }

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



}
