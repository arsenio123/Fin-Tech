package com.ussain.clock.alarme.servico;

import com.ussain.clock.alarme.model.Clock;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;

//@Configuration
//@EnableScheduling
public class AlarmService {

   // @Scheduled(fixedDelay = 1000)
    public String alertEvent(){
        String message= "alerta it is time";
        //System.out.println(message);
        return message;
    }

    //@Scheduled (fixedDelay = 1000)
    private void runClock(){
        if(Clock.getInstance().getSec()>=59) {
            Clock.getInstance().setSec(0);
            if(Clock.getInstance().getMin()>=59){
               Clock.getInstance().setMin(0);
               if(Clock.getInstance().getHour()==23)
                    Clock.getInstance().setHour(0);
                    Clock.getInstance().setHour(Clock.getInstance().getHour()+1);

            }else {
                Clock.getInstance().setMin(Clock.getInstance().getMin()+1);
            }
        }
        else
        Clock.getInstance().setSec(Clock.getInstance().getSec()+1);
        System.out.println("Hour:"+Clock.getInstance().getHour()+" Min: "+Clock.getInstance().getMin()+" Sec:"+Clock.getInstance().getSec());
    }


}
