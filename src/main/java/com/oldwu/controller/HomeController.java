package com.oldwu.controller;

import com.miyoushe.model.AutoMihayou;
import com.miyoushe.service.MihayouService;
import com.netmusic.model.AutoNetmusic;
import com.netmusic.service.NetmusicService;
import com.oldwu.domain.Msg;
import com.oldwu.entity.AutoLog;
import com.oldwu.entity.BiliPlan;
import com.oldwu.service.BiliService;
import com.oldwu.service.LogService;
import com.oldwu.service.RegService;
import com.oldwu.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Date;
import java.util.List;

/**
 * Created by yangyibo on 17/1/18.
 */
@Controller
public class HomeController {
    @Autowired
    private RegService regService;
    @Autowired
    private BiliService biliService;
    @Autowired
    private UserService userService;
    @Autowired
    private LogService logService;
    @Autowired
    private NetmusicService netmusicService;
    @Autowired
    private MihayouService mihayouService;

    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

//    @GetMapping("/include")
//    public String include() {
//        return "include";
//    }

    @PostMapping("/reg")
    public String regpo(@Param("username") String username, @Param("password") String password, Model model) {
        String s = regService.doReg(username, password);
        if (s == null) {
            model.addAttribute("regok", true);
            return "login";
        }
        model.addAttribute("msg", s);
        model.addAttribute("error", true);
        return "reg";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/getlog")
    public String getLog(Model model, Principal principal, @Param("id") Integer id, @Param("type") String type) {
        AutoLog log = logService.getLog(id, type, userService.getUserId(principal.getName()));
        if (log == null || log.getId() == null) {
            AutoLog log1 = new AutoLog();
            log1.setText("当前无日志");
            log1.setDate(new Date());
            model.addAttribute("log", log1);
            return "getlog";
        }
        model.addAttribute("log", log);
        return "getlog";
    }

    @GetMapping("/my")
    public String myIndex(Model model, Principal principal) {
        List<BiliPlan> biliPlans = biliService.getMyPlan(userService.getUserId(principal.getName()));
        List<AutoNetmusic> netplans = netmusicService.getMyPlan(userService.getUserId(principal.getName()));
        List<AutoMihayou> mihuyouplans = mihayouService.getMyPlan(userService.getUserId(principal.getName()));
        model.addAttribute("bililist", biliPlans);
        model.addAttribute("netlist", netplans);
        model.addAttribute("milist", mihuyouplans);
        return "my-helper";
    }
}
