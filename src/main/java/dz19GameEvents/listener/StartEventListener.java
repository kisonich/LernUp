package dz19GameEvents.listener;

import dz19GameEvents.events.StartGameEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StartEventListener implements ApplicationListener<StartGameEvent> {
@Value("${greetings1}")
    private String greetings1;
@Value("${greetings2}")
    private String greetings2;
    @Override
    public void onApplicationEvent(StartGameEvent event) {
        System.out.println(greetings1);
        System.out.println(greetings2);
    }
}
