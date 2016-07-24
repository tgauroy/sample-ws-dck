package tgy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tgy.beans.TestBean;
import tgy.repos.EsTestBeanRepo;

import javax.annotation.PostConstruct;


/**
 * Created by thomasgauroy on 14/07/2016.
 */
@RestController
public class TestController {

    @Autowired
    EsTestBeanRepo repo;

    @PostConstruct
    private void initEs(){
        repo.save(new TestBean("esToto","esTata"));
    }

    @RequestMapping("/get")
    public TestBean getTest(){
        return new TestBean("toto","tata");
    }


    @RequestMapping("/getEs")
    public TestBean getEsTest() {
        return repo.findOne("esToto");
    }
}
