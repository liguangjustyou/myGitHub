package guang.ssm.controller;

import guang.ssm.domain.Items;
import guang.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemsController {
    // 依赖于ItemService
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/list")
    public String list(Model model){
        List<Items> items = itemsService.queryAll();
        // 使用其中的model来进行使用吧
         model.addAttribute("items",items);
        System.out.println(items);
        return "items";
    }
}
