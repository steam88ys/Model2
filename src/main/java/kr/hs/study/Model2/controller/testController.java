package kr.hs.study.Model2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(@RequestParam("id") String id,
                        @RequestParam("pass") String pass,
                        @RequestParam("nickName") String nickName,
                        Model model) {
        model.addAttribute("uid", id);
        model.addAttribute("upass", pass);
        model.addAttribute("unickName", nickName);
        return "re_test1";
    }

    @GetMapping("/test2")
    public String test2(Model model) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("park");
        list.add("kang");
        list.add("min");
        model.addAttribute("list1", list);
        return "re_test2";
    }

}
