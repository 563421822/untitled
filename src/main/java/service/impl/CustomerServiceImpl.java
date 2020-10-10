package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.TCustomer;
import service.ICustomerService;

import java.util.ArrayList;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper mapper;

    @Override
    public PageInfo<TCustomer> queryAll(Integer page, Integer limit, String username, Integer state) {
        return getCustomerPageInfo(page, limit, username, state);
    }

    @Override
    public int add(TCustomer customer) {
        return mapper.insert(customer);
    }

    @Override
    public PageInfo<TCustomer> getCustomerPageInfo(Integer page, Integer limit, String username, Integer state) {
        PageHelper.startPage(page, limit);
//        数据库中把所有记录都查询出来
        ArrayList<TCustomer> list = mapper.queryAll(username, state);
        return new PageInfo<>(list);
    }

    @Override
    public int update(TCustomer customer) {
        return mapper.updateBy(customer);
    }

    @Override
    public int delete(int[] id) {
        return mapper.deleteBy(id);
    }
}
