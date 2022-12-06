package dz19GameEvents.listener;

import dz19GameEvents.events.WrongAnswerGameEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class WrongAnswerGameEventListener implements ApplicationListener<WrongAnswerGameEvent> {
    @Value("${wrongAnswer1}")
    private String answer1;

    @Value("${wrongAnswer2}")
    private String answer2;
    @Override
    public void onApplicationEvent(WrongAnswerGameEvent event) {

        if (event.getResult() > event.getAnswerUser()) {
            System.out.println(answer1);
        } else {
            System.out.println(answer2);
        }
    }
}
