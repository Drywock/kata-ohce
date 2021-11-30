package net.efrei.ohce;

import java.time.LocalTime;

public class FakeClockInterface implements ClockInterface {
    private LocalTime fakeTime = LocalTime.of(12,0);

    public void setFakeTime(LocalTime fakeTime) {
        this.fakeTime = fakeTime;
    }

    @Override
    public LocalTime getCurrentTime() {
        return fakeTime;
    }
}
