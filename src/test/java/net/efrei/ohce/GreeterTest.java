package net.efrei.ohce;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class GreeterTest {
    @Test
    public void shouldGreetMorning() {
        FakeClockInterface fClock = new FakeClockInterface();
        fClock.setFakeTime(LocalTime.of(7,0));
        final String name = "Tho-Line";
        Greeter greeter = new Greeter(fClock);

        assertEquals("Buenos dias "+name,greeter.greet(name)) ;
    }

    @Test
    public void shouldGreetAfternoon() {
        FakeClockInterface fClock = new FakeClockInterface();
        fClock.setFakeTime(LocalTime.of(14,0));
        final String name = "Tho-Line";
        Greeter greeter = new Greeter(fClock);

        assertEquals("Buenas tardes "+name,greeter.greet(name)) ;
    }

    @Test
    public void shouldGreetNight() {
        FakeClockInterface fClock = new FakeClockInterface();
        fClock.setFakeTime(LocalTime.of(2,0));
        final String name = "Tho-Line";
        Greeter greeter = new Greeter(fClock);

        assertEquals("Buenas noches "+name,greeter.greet(name)) ;
    }
}
