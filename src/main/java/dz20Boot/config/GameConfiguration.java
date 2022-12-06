package dz20Boot.config;

import dz20Boot.listener.FinishGameEventListener;
import dz20Boot.listener.StartEventListener;
import dz20Boot.listener.WrongAnswerGameEventListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // способ создания спринг бинов.
public class GameConfiguration {

    @Value("${greetings1}")
    private String greetings1;
    @Value("${greetings2}")
    private String greetings2;

    @Value("${rightAnswer}")
    private String rightAnswer;


    @Value("Мое число побольше твоего")
    private String answer1;

    @Value("${wrongAnswer2}")
    private String answer2;

    @Bean
    public StartEventListener startEventListener(){ // Внедрение с помощью setter
        StartEventListener startEventListener = new StartEventListener();
        startEventListener.setGreetings1(greetings1);
        startEventListener.setGreetings2(greetings2);
        return startEventListener;
    }

    @Bean
    public FinishGameEventListener finishEventListener(){ // Внедрение с помощью конструкирра

        return new FinishGameEventListener(rightAnswer);
    }

    @Bean
    public WrongAnswerGameEventListener findEventListener(){

        return new WrongAnswerGameEventListener(answer1, answer2);
    }

}
