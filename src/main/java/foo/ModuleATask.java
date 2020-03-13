package foo;

import foo.api.Task;
import foo.service.GenericService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("foo.ModuleATask")
public class ModuleATask implements Task {

    @Autowired
    private GenericService genericService;

    private String name = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";

    @Override
    public void run() {
        System.out.println("Em ModuleA Task!!!!!!!!!!!");
        System.out.println(StringUtils.abbreviate(name, 20));
        genericService.exec();
    }
}
