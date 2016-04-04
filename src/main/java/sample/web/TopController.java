package sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yukieen on 2016/04/04.
 */
@Controller
@RequestMapping("")
public class TopController {

    @RequestMapping("")
    public String index() {
        return "index";
    }

}
