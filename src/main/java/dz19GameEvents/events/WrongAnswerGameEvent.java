package dz19GameEvents.events;

import org.springframework.context.ApplicationEvent;

public class WrongAnswerGameEvent extends ApplicationEvent {
    private int result;
    private int answerUser;


    public WrongAnswerGameEvent(Object source, int result, int answerUser) {
        super(source);
        this.result = result;
        this.answerUser = answerUser;
    }

    public int getResult() {
        return result;
    }

    public int getAnswerUser() {
        return answerUser;
    }
}
