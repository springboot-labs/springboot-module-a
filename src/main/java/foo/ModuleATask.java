package foo;

import foo.api.Task;
import org.springframework.stereotype.Component;

@Component("foo.ModuleATask")
public class ModuleATask implements Task {
    @Override
    public void run() {
        System.out.println("Em ModuleA Task!!!!!!!!!!!");
    }
}
