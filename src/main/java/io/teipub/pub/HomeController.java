package io.teipub.pub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tei on 17. 3. 9.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@Controller
public class HomeController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "static html";
    }
}
