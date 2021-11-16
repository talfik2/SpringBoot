package restfulwebservice01;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SF01Controller {
    // 1'st Way
//    @RequestMapping(method= RequestMethod.GET, path="/getRequest")
//    public String getMethod() {
//        return "Get Request is taken...";
//    }
    // 2'nd Way: Recommended
    @GetMapping(path="/getRequest")
    public String getMethod1() {
        return "Get Request is taken...";
    }

    @GetMapping(path = "/getBean")
    public SF02ControllerBean getMethod2() {
        return new SF02ControllerBean("This is get request to return message object...");
    }

    // 3'rd Way - returns stuff by name
    @GetMapping(path="/getParameterized/{name}")
    public SF02ControllerBean getMethod3(@PathVariable String name) {
        return new SF02ControllerBean(String.format("Hey, %s this is your page....", name));
    }

    // 4'th Way- returns list
    @GetMapping(path= "getList/{name}")
    public List<SF02ControllerBean> getMethod4(@PathVariable String name) {
        return List.of(new SF02ControllerBean(String.format("Hi %s", name)),
                        new SF02ControllerBean(String.format("Hi %s", name)),
                        new SF02ControllerBean(String.format("%s do you want to drink coffee", name)));
    }

}
