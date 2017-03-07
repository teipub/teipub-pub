package io.teipub.pub

import org.springframework.data.querydsl.QueryDslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.NoRepositoryBean

import java.io.Serializable

/**
 * Created by tei on 16. 11. 3.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@NoRepositoryBean
interface BaseRepository<T, Y : Serializable> : CrudRepository<T, Y>, QueryDslPredicateExecutor<T>
