import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tgy.Application;
import tgy.beans.TestBean;
import tgy.controller.TestController;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by thomasgauroy on 14/07/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class TestWs {

    @Autowired
    TestController controller;

    @Test
    public void should_return_toto_tata() throws Exception {

        TestBean testBean = new TestBean("toto","tata");


        TestBean fromWs =controller.getTest();

        assertThat(testBean.getContent(),is(fromWs.getContent()));
        assertThat(testBean.getId(),is(fromWs.getId()));
    }

    @Test
    public void should_return_bean_from_es (){
        TestBean testBean = new TestBean("esToto","esTata");

        TestBean fromWsEs = controller.getEsTest();

        assertThat(testBean.getContent(),is(fromWsEs.getContent()));
        assertThat(testBean.getId(),is(fromWsEs.getId()));

    }
}
