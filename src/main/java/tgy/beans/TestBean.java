package tgy.beans;

/**
 * Created by thomasgauroy on 14/07/2016.
 */
public class TestBean {

    private String id;

    private String content;

    public TestBean(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
