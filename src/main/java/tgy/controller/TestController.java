package tgy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tgy.beans.TestBean;


/**
 * Created by thomasgauroy on 14/07/2016.
 */
@RestController
public class TestController {

    @RequestMapping("/get")
    public TestBean getTest(){
        return new TestBean("toto","tata");
    }


}
