package com.ussain.clock.alarme.api;

import com.ussain.clock.alarme.servico.ClockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlarmeApi {

    private ClockService clockService= new ClockService();

    @GetMapping("/clock/hour")
    public int getHour(){
        return clockService.getHoras();
    }

    @GetMapping("/clock/min")
    public int getMin(){
        return clockService.geMin();
    }

    @GetMapping("/clock/sec")
    public int getSec(){
        return clockService.geMin();
    }
}
