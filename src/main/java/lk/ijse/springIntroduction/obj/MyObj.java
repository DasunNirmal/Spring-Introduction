package lk.ijse.springIntroduction.obj;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component("myObj")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)*/
public class MyObj {

    public MyObj() {
        System.out.println("My Obj");
    }

}
