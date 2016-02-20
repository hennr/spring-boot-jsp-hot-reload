package name.hennr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserAgentController {

    @RequestMapping("/useragent")
    @ResponseBody
    public String showUserAgent(@RequestHeader("User-Agent") String userAgent) {
        return userAgent;
    }
}
