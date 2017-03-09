package io.teipub.pub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tei on 17. 3. 9.
 * mac-sys.co.kr
 * roryalroad.co.kr
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {

        return "Home";
    }
}
