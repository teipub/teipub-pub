package io.teipub

import io.teipub.domain.Post
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView
import java.util.*
import kotlin.reflect.jvm.internal.impl.javax.inject.Inject

/**
 * Created by tei on 17. 3. 2.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@Controller
class HomeController {

    @Autowired
    lateinit var postRepository: PostRepository

    @GetMapping("/")
    fun home(): ModelAndView {
        var mav = ModelAndView()
        mav.viewName = "home"
        mav.addObject("title", "Home")

        var post = Post()
        post.title = "title"
        post.content = "content"
        post.createdAt = Calendar.getInstance()
        postRepository.save(post)

        mav.addObject("total", postRepository.count())

        return mav
    }
}