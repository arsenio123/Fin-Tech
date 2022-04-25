package com.ussain.clock.alarme.servico;

import com.ussain.clock.alarme.model.Clock;

public class ClockService {
    private Clock clock= Clock.getInstance();

    public int getHoras(){

        return clock.getHour();
    }

    public int geMin() {
        return clock.getMin();
    }
}
