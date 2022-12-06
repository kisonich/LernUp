package dz20Boot.listener;

import dz19GameEvents.events.StartGameEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class StartEventListener implements ApplicationListener<StartGameEvent> {
    private String greetings1;
    private String greetings2;

    public void setGreetings1(String greetings1) {
        this.greetings1 = greetings1;
    }
    public void setGreetings2(String greetings2) {
        this.greetings2 = greetings2;
    }

    @Override
    public void onApplicationEvent(StartGameEvent event) {
        System.out.println(greetings1);
        System.out.println(greetings2);
    }
}
