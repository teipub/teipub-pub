package io.teipub.pub;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by tei on 16. 11. 3.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@NoRepositoryBean
public interface BaseRepository<T, Y extends Serializable> extends CrudRepository<T, Y>,
        QueryDslPredicateExecutor<T> {
}
