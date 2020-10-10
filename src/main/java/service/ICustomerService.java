package service;

import com.github.pagehelper.PageInfo;
import pojo.TCustomer;

public interface ICustomerService {
    /**
     * 查询所有客户的接口
     *
     * @param page
     * @param start
     * @param username
     * @param size
     * @return
     */
    PageInfo<TCustomer> queryAll(Integer page, Integer limit, String username, Integer state);

    /**
     * 添加客户的接口
     *
     * @param customer
     * @return
     */
    int add(TCustomer customer);

    /**
     * 分页的接口
     *
     * @param integer
     * @param page
     * @param username
     * @param limit
     * @return
     */
    PageInfo<TCustomer> getCustomerPageInfo(Integer integer, Integer page, String username, Integer limit);

    /**
     * 更新记录的接口
     *
     * @param customer
     * @return
     */
    int update(TCustomer customer);

    int delete(int[] id);
}
