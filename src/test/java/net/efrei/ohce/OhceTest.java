package net.efrei.ohce;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OhceTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void beforeEach() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void afterEach() {
        System.setOut(standardOut);
    }

    @Test
    public void shouldStop() {
        FakeUserInputInterface fUi = new FakeUserInputInterface();
        FakeClockInterface fClock = new FakeClockInterface();
        String name = "";
        fUi.setFakeInput("Stop");

        Ohce ohce = new Ohce(fClock, fUi, name);
        ohce.start();
    }


    @Disabled("Work in progress")
    @Test
    public void userInputEmptyString() {
        FakeUserInputInterface fUi = new FakeUserInputInterface();
        FakeClockInterface fClock = new FakeClockInterface();
        String name = "Tho-Line";

        fUi.setFakeInput("");
        Ohce ohce = new Ohce(fClock, fUi, name);
        ohce.start();


    }



}
