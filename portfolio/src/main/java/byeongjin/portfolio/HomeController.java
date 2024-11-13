package byeongjin.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "GoByeongJin");
        model.addAttribute("intro", "끊임없이 자기 개발과 성장하려고 노력하는 개발자 고병진입니다.");
        model.addAttribute("phone", "010-7142-8184");
        model.addAttribute("email", "rhqudwls13@naver.com");
        model.addAttribute("instagram", "my.kbj");
        return "index"; // templates/index.html 반환
    }
}
