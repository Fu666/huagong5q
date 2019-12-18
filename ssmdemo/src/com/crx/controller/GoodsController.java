package com.crx.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.crx.pojo.Goods;
import com.crx.service.GoodsService;

@Controller
@RequestMapping("goods")
public class GoodsController {
	@Resource
	private GoodsService gs;
	
@RequestMapping("findAll")
	public String findAll(Model model) {
	System.out.println(0);
	List<Goods> goods=gs.findAll();
	model.addAttribute("goods",goods);
	return "/goods__list";
}
@RequestMapping("insert")
public String insert(Goods goods,MultipartFile upfile) {
goods.setImg(upload(upfile));
	gs.insert(goods);
	return "redirect:/goods/findAll.action";//redirect重定向/绝对路径
	}

public String upload(MultipartFile upfile) {
	String filename=upfile.getOriginalFilename();
	String newname="";
	if("".equals(filename)) {
	 newname=UUID.randomUUID()+filename.substring(filename.lastIndexOf("."));
		File f=new File("d://aa//"+newname);
		try {
			upfile.transferTo(f);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	return newname;
}
@RequestMapping("delete")
public String delete(int id) {
	gs.delete(id);
	return "redirect:/goods/findAll.action";
}
@RequestMapping("yupdate")
public String findById(int id,Model model) {
	Goods goods=gs.findById(id);
	model.addAttribute("updategoods",goods);
	return "../goods_update";
}
@RequestMapping("update")
public String update(Goods goods,MultipartFile upfile) {
	if(!"".equals(upfile.getOriginalFilename())) {
		String newname=upload(upfile);
		goods.setImg(newname);
	}
	gs.update(goods);
	return "redirect:/goods/findAll.action";
}
}
