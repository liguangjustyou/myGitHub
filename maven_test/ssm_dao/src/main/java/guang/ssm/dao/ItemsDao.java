package guang.ssm.dao;

import guang.ssm.domain.Items;

import java.util.List;

public interface ItemsDao {
    // 查询所有的操作
    List<Items> queryAll();
    // 保存一个用户的操作
    int save(Items items);

}
