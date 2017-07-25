package win.likie.mvc.action;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by huahui.wu on 2017/5/16.
 *
 */
public class BasicAction {
	protected transient Logger logger = LoggerFactory.getLogger(getClass());
	protected ModelAndView modelAndView = new ModelAndView();
}
