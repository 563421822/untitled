package mapper;

import pojo.TMenu;

import java.util.ArrayList;

public interface MenuMapper {
    ArrayList<TMenu> queryAll(long id);
}
