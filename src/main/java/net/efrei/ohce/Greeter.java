package net.efrei.ohce;

import java.time.LocalTime;

public class Greeter {
    private ClockInterface clock;

    public Greeter(ClockInterface clock) {
        this.clock = clock;
    }

    public String greet(String name){
        final LocalTime currentTime = this.clock.getCurrentTime();
        if (currentTime.isAfter(LocalTime.of(6,0)) && currentTime.isBefore(LocalTime.of(12,0))) {
            return "Buenos dias "+name;
        } else if (currentTime.isAfter(LocalTime.of(12,0)) && currentTime.isBefore(LocalTime.of(20,0))){
            return "Buenas tardes "+name;
        } else {
            return "Buenas noches " + name;
        }
    }
}
