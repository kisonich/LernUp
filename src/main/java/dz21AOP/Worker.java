package dz21AOP;

import org.springframework.stereotype.Component;

@Component
public class Worker {

    @LogMethod
    public void work(String jobName) {
        System.out.println("Worker делает работу " + jobName);

    }

    @WorkTime
    public void rest(){
        System.out.println("Worker начал отдыхвть");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker закончил отдыхвть");
    }

    @LogMethod
    @WorkTime
    public void sleep(){
        System.out.println("Worker начал спать");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker закончил спать");
    }
}
