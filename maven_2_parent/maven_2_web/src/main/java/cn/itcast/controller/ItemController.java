package cn.itcast.controller;

import cn.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/findDetail")
    public String findDetail(Model model, int id){
        model.addAttribute("item", itemService.findById(id));
        return "itemDetail";
    }
}
