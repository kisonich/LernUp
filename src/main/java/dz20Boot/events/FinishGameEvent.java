package dz20Boot.events;

import org.springframework.context.ApplicationEvent;

public class FinishGameEvent extends ApplicationEvent {
    private int answer;

    public FinishGameEvent(Object source, int answer) {
        super(source);
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }
}
