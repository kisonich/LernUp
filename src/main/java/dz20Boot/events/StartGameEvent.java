package dz20Boot.events;

import org.springframework.context.ApplicationEvent;

public class StartGameEvent extends ApplicationEvent {

    public StartGameEvent(Object source) {
        super(source);
    }
}
