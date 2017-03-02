package io.teipub

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

/**
 * Created by tei on 17. 3. 2.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@Controller
class HomeController {

    @GetMapping("/")
    fun home(): ModelAndView {
        var mav = ModelAndView()
        mav.viewName = "home"
        mav.addObject("title", "Home")

        return mav
    }
}