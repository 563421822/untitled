package mapper;

import pojo.TCustomer;

import java.util.ArrayList;

public interface CustomerMapper {
    /**
     * 增加的接口
     *
     * @param customer
     * @return
     */
    int insert(TCustomer customer);



    /**
     * 靠对象属性查询记录的接口
     *
     * @param customer
     * @return
     */
    TCustomer querySingle(TCustomer customer);

    /**
     * 查询所有记录 返回对象集合的接口
     *
     * @param
     * @param username
     * @param state
     * @return
     */
    ArrayList<TCustomer> queryAll(String username, Integer state);

    /**
     * 靠任何条件更新的接口
     *
     * @param customer
     * @return
     */
    int updateBy(TCustomer customer);

    int deleteBy(int[] id);
}
