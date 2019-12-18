package com.crx.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crx.mapper.GoodsMapper;
import com.crx.pojo.Goods;
import com.crx.pojo.GoodsExample;

@Service
public class GoodsService {

	@Resource
	private GoodsMapper gm;
	
	public List<Goods> findAll() {
		
		return gm.selectByExample(new GoodsExample());
	}

	public void insert(Goods goods) {
		gm.insert(goods);
		

	}

		

	public void delete(int id) {
		gm.deleteByPrimaryKey(id);
	}

	public Goods findById(int id) {
		return gm.selectByPrimaryKey(id);
	}

	public void update(Goods goods) {
		gm.updateByPrimaryKey(goods);
	}

}
