package guang.test;

import guang.ssm.dao.ItemsDao;
import guang.ssm.domain.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoTest {
    public static void main(String[] args) {
        // 首先获取得到容器，因为整合了spring。通过反射的放射获取得到对象。id名称是类名的小写
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        // 获取得到对象
//        ItemsDao bean = ac.getBean(ItemsDao.class);
       ItemsDao itemsDao =(ItemsDao) ac.getBean("itemsDao");
        System.out.println(itemsDao);
        List<Items> items = itemsDao.queryAll();
        for (Items item : items) {
            System.out.println(item);
        }
    }
}
