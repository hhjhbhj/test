package deal.controller.controller;

/**
 * Created by Administrator on 2016/1/4.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
  private static Logger logger = LoggerFactory.getLogger(HomeController.class);
  @RequestMapping("/home")
  public String home(Model model) {
    logger.info ("home.jsp");
    model.addAttribute("message", "hello, world");
    //return "WEB-INF/views/home.jsp";

    return "home";
  }
}
