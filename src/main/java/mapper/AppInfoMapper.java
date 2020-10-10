package mapper;

import pojo.TAppInfo;

import java.util.ArrayList;


public interface AppInfoMapper {
    /**
     * 增加的接口
     *
     * @param
     * @return
     */
    int insert(TAppInfo appinfo);



    /**
     * 查询所有记录 返回对象集合的接口
     *
     * @param
     * @param
     * @param state
     * @return
     */
    ArrayList<TAppInfo> queryAll(String appName, Integer state);

    /**
     * 靠任何条件更新的接口
     *
     * @param
     * @return
     */
    int updateBy(TAppInfo appinfo);

    int deleteBy(int[] id);
}
