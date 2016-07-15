import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import tgy.beans.TestBean;
import tgy.controller.TestController;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by thomasgauroy on 14/07/2016.
 */
@RunWith(JUnit4.class)
public class TestWs {

    @Test
    public void should_return_toto_tata() throws Exception {

        TestBean testBean = new TestBean("toto","tata");

        TestController controller = new TestController();

        TestBean fromWs =controller.getTest();

        testBean.getId();
        assertThat(testBean.getContent(),is(fromWs.getContent()));
        assertThat(testBean.getId(),is(fromWs.getId()));
    }
}
