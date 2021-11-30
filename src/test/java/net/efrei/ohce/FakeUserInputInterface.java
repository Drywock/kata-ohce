package net.efrei.ohce;

public class FakeUserInputInterface implements UserInputInterface{

    private String fakeInput = "";

    public void setFakeInput(String fakeInput) {
        this.fakeInput = fakeInput;
    }

    @Override
    public String getUserInput() {

        return fakeInput;
    }
}
