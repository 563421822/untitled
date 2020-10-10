package service.impl;

import mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.TMenu;
import service.IMenuService;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class MenuServiceImpl implements IMenuService {
    @Autowired
    private MenuMapper mapper;

    @Override
    public ArrayList<TMenu> query(long id) {
        ArrayList<TMenu> originList = mapper.queryAll(id);
        return menuOper(originList);
    }

    private ArrayList<TMenu> menuOper(ArrayList<TMenu> originList) {
//        创建一个集合,存放父菜单
        ArrayList<TMenu> parentMenu = new ArrayList<>();
//      创建一个map集合,来放所有的菜单信息
        HashMap<Long, TMenu> newMap = new HashMap<>();
        for (TMenu menu : originList) {
            newMap.put(menu.getId(), menu);//通过对象的键名id把所有所属的值存入新的map
            if (menu.getParentId() == null) {
//                没有父Id,他是一个父菜单
                parentMenu.add(menu);
            }
        }
//        再次遍历原始集合
        for (TMenu menu : originList) {
//            如果原始集合中的菜单类型是2,则不管
            if (menu.getParentId() != null && newMap.containsKey(menu.getParentId())) {
//                把子菜单放到父菜单的子菜单集合中
                newMap.get(menu.getParentId()).getList().add(menu);
            }
        }
        return parentMenu;
    }
}
