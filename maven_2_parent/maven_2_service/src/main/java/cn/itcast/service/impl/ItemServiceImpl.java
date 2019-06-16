package cn.itcast.service.impl;

import cn.itcast.dao.ItemDao;
import cn.itcast.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements cn.itcast.service.ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public Item findById(int id) {
        return itemDao.findById(id);
    }

}
