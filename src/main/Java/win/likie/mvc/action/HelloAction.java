package win.likie.mvc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huahui.wu on 2017/5/16.
 */
@Controller
public class HelloAction {

		@RequestMapping(value = "/")
		public String index() {
			return "index";
		}
}
