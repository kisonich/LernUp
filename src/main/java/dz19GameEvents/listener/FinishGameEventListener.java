package dz19GameEvents.listener;

import dz19GameEvents.events.FinishGameEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class FinishGameEventListener implements ApplicationListener<FinishGameEvent> {
    @Value("${rightAnswer}")
    private String rightAnswer;

    @Override
    public void onApplicationEvent(FinishGameEvent event) {

        System.out.println(rightAnswer);

    }
}
