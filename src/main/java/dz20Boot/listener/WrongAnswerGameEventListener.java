package dz20Boot.listener;

import dz19GameEvents.events.WrongAnswerGameEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class WrongAnswerGameEventListener implements ApplicationListener<WrongAnswerGameEvent> {
    private String answer1;
    private String answer2;

    public WrongAnswerGameEventListener(String answer1, String answer2) {
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    @Override
    public void onApplicationEvent(WrongAnswerGameEvent event) {

        if (event.getResult() > event.getAnswerUser()) {
            System.out.println(answer1);
        } else {
            System.out.println(answer2);
        }
    }
}
