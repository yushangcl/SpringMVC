package win.likie.mvc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by huahui.wu on 2017/9/6.
 */
@Component
public class TestTask {
    @Scheduled(cron = "0 0/1 * * * ?")
    public void task() {
        System.out.println("task:1");
    }
}
