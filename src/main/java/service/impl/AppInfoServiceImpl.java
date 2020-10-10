package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.AppInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.TAppInfo;
import service.IAppInfoService;

import java.util.ArrayList;

@Service
public class AppInfoServiceImpl implements IAppInfoService {
    @Autowired
    AppInfoMapper mapper;

    @Override
    public PageInfo<TAppInfo> queryAll(Integer page, Integer limit, String appName, Integer state) {
        return getAppPageInfo(page, limit, appName, state);
    }

    @Override
    public int add(TAppInfo appinfo) {
        return mapper.insert(appinfo);
    }

    @Override
    public PageInfo<TAppInfo> getAppPageInfo(Integer page, Integer limit, String appName, Integer state) {
        PageHelper.startPage(page, limit);
//        数据库中把所有记录都查询出来
        ArrayList<TAppInfo> list = mapper.queryAll(appName, state);
        return new PageInfo<>(list);
    }

    @Override
    public int update(TAppInfo appinfo) {
        return mapper.updateBy(appinfo);
    }

    @Override
    public int delete(int[] id) {
        return mapper.deleteBy(id);
    }
}
