package tgy.repos;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import tgy.beans.TestBean;

/**
 * Created by thomasgauroy on 22/07/2016.
 */
@Repository
public interface EsTestBeanRepo extends ElasticsearchRepository<TestBean,String> {
}
