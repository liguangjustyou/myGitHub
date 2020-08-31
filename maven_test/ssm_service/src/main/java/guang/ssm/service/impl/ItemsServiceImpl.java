package guang.ssm.service.impl;

import guang.ssm.dao.ItemsDao;
import guang.ssm.domain.Items;
import guang.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    // 在这里需要依赖到ItemsService。所以需要进行依赖注入
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> queryAll() {
        return itemsDao.queryAll();
    }

    @Override
    public int save(Items items) {
        return 0;
    }
}
