package controller;

import bean.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.TAdminUser;
import pojo.TMenu;
import service.IMenuService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    IMenuService service;

    @RequestMapping("/list")
    public AjaxResponse list(HttpSession session) {
//        判断session中是否有值
        TAdminUser adminUser = (TAdminUser) session.getAttribute("login");
        if (adminUser != null) {
            ArrayList<TMenu> query = service.query(adminUser.getId());
            return new AjaxResponse(true, "", query, adminUser);
        }
        return null;
    }
}
