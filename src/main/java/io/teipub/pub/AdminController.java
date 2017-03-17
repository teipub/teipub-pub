package io.teipub.pub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by tei on 17. 3. 17.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin() {

        return "index.html";
    }
}
