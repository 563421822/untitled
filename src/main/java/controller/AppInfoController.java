package controller;

import bean.AjaxResponse;
import bean.TableData;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pojo.TAppInfo;
import service.IAppInfoService;

@RestController
@RequestMapping("/appInfo")
public class AppInfoController {
    @Autowired
    private IAppInfoService service;

    @RequestMapping("/queryAll")
    public TableData<TAppInfo> queryAll(@RequestParam(defaultValue = "1") Integer page, Integer limit, String appName, Integer state) {
//        page:起始记录条数,limit每页显示的记录条数,username:用户名称,state:用户状态
        PageInfo<TAppInfo> pageInfo = service.queryAll(page, limit, appName, state);

        TableData<TAppInfo> data = new TableData<>();
        data.setCode(0);//设置前端的状态码
        data.setCount(pageInfo.getTotal());
        data.setData(pageInfo.getList());
        return data;
    }

    @PostMapping("/add")
    public AjaxResponse add(TAppInfo appInfo) {
        int result = service.add(appInfo);
        if (result > 0) {
            return new AjaxResponse(true, "");
        }
        return null;
    }

    @RequestMapping("/update")
    public AjaxResponse update(TAppInfo appInfo) {
        int result = service.update(appInfo);
        System.out.println("appInfoController.update");
        if (result > 0) {
            System.out.println("修改成功");
            return new AjaxResponse(true, "");
        }
        return null;
    }

    @RequestMapping("/delete")
    public AjaxResponse delete(int[] id) {
        int result = service.delete(id);
        if (result > 0) {
            System.out.println("删除成功");
            return new AjaxResponse(true, "");
        }
        return null;
    }
}
