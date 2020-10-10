package service.impl;

import mapper.AdminUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.TAdminUser;
import service.IAdminUserService;

@Service
public class AdminUserServiceImpl implements IAdminUserService {
    @Autowired
    AdminUserMapper mapper;

    @Override
    public TAdminUser login(TAdminUser adminUser) {
        return mapper.login(adminUser);
    }
}
