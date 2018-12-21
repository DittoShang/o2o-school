package com.yihuschool.o2o.dao;

import com.yihuschool.o2o.entity.Shop;

public interface ShopDao {
	//新增店铺
	int insertShop(Shop shop);
	
	//更新店铺
	int updateShop(Shop shop);
}
