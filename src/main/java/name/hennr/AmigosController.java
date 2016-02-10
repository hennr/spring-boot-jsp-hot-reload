package name.hennr;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AmigosController {

	@Value("${application.message:Fallback Hello World message}")
	private String message;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcomeAmigos";
	}

	@RequestMapping("/amigos")
	@ResponseBody
	public String foo() {
		return "si";
	}
}
