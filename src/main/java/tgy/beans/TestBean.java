package tgy.beans;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by thomasgauroy on 14/07/2016.
 */
@Document(indexName = "resource", type = "test")
@Data
public class TestBean {


    @Id
    private String id;

    private String content;

    public TestBean(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public TestBean() {
    }
}

