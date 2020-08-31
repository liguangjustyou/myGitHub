package guang.test;

import guang.ssm.domain.Items;
import guang.ssm.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoTest {
    public static void main(String[] args) {
        // 获取得到容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        // 根据对象来获取得到对应的对象。使用了spring的注解，那么说明
        ItemsService itemsServiceImpl = ac.getBean("itemsServiceImpl", ItemsService.class);
        List<Items> items = itemsServiceImpl.queryAll();
        for (Items item : items) {
            System.out.println(item);
        }
    }
}
