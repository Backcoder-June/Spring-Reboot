/*
package ReBoot.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component                             // config 에서 @Bean 으로 줘도 되는데, 뭘 하나더 해줘야함
@Aspect                            // @Aspect - > 여기 AOP 있어요!
public class TimetraceAOP {

    @Around("execution(* ReBoot..*(..))")            // @Around("execution( * 상위패키지.원하는패키지.*(.원하는클래스.))")
    public Object excute(ProceedingJoinPoint joinPoint)throws Throwable {
        long Start = System.currentTimeMillis();
        System.out.println("Start : " + joinPoint.toString());
        try { Object result = joinPoint.proceed();
            return result;}
        finally { long Finish = System.currentTimeMillis();
            long timeMS = Finish - Start;
            System.out.println("Finish : " + joinPoint.toString() + "total time" + timeMS+"ms");}

    }

}
*/