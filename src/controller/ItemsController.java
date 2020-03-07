package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pojo.Items;

@Controller
public class ItemsController {

	@RequestMapping("/items")
	public ModelAndView itemList() {
		ModelAndView mv = new ModelAndView();
		// 创建页面需要显示的商品数据
		List<Items> itemList = new ArrayList<Items>();
		Items i1 = new Items();
		i1.setName("1华为 荣耀8");
		Items i2 = new Items();
		i2.setName("2华为 荣耀8");
		itemList.add(i1);
		itemList.add(i2);
		mv.addObject("itemList", itemList);
		mv.setViewName("itemList");

		return mv;
	}

	// json数据交互
	@RequestMapping("/json")
	@ResponseBody
	public Items json(Items items) {
		System.out.println(items.getPrice());
		return items;
	}

}
