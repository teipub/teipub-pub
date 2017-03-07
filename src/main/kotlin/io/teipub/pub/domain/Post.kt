package io.teipub.pub.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by tei on 17. 3. 3.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@Entity
class Post {
    @Id
    @GeneratedValue
    var id: Int? = null

    lateinit var title: String
    lateinit var content: String
    lateinit var createdAt: Calendar
}