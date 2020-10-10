package service;

import com.github.pagehelper.PageInfo;
import pojo.TAppInfo;

public interface IAppInfoService {
    /**
     * 查询所有客户的接口
     *
     * @param page
     * @param 
     * @param
     * @param 
     * @return
     */
    PageInfo<TAppInfo> queryAll(Integer page, Integer limit, String AppName, Integer state);

    /**
     * 添加客户的接口
     *
     * @param 
     * @return
     */
    int add(TAppInfo appinfo);

    /**
     * 分页的接口
     *
     * @param integer
     * @param page
     * @param appName
     * @param limit
     * @return
     */
    PageInfo<TAppInfo> getAppPageInfo(Integer integer, Integer page, String appName, Integer limit);

    /**
     * 更新记录的接口
     *
     * @param 
     * @return
     */
    int update(TAppInfo appinfo);

    int delete(int[] id);
}
