package controller;

import bean.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.TAdminUser;
import service.IAdminUserService;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/adminUser")
public class AdminUserController {
    @Autowired
    IAdminUserService service;

    @RequestMapping("/login")
    public AjaxResponse login(TAdminUser adminUser, HttpSession session) {
        TAdminUser user = service.login(adminUser);
        if (user != null) {
            session.setAttribute("login", user);
            return new AjaxResponse(true, "");
        }
        return null;
    }
}
