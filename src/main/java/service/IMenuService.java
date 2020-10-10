package service;

import pojo.TMenu;

import java.util.ArrayList;

public interface IMenuService {
    ArrayList<TMenu> query(long adminUser);

}
