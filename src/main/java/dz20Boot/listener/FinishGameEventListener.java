package dz20Boot.listener;

import dz19GameEvents.events.FinishGameEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class FinishGameEventListener implements ApplicationListener<FinishGameEvent> {
    private String rightAnswer;

    public FinishGameEventListener(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    @Override
    public void onApplicationEvent(FinishGameEvent event) {

        System.out.println(rightAnswer);

    }
}
