package com.yihuschool.o2o.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.yihuschool.o2o.BaseTest;
import com.yihuschool.o2o.dto.ShopExecution;
import com.yihuschool.o2o.entity.Area;
import com.yihuschool.o2o.entity.PersonInfo;
import com.yihuschool.o2o.entity.Shop;
import com.yihuschool.o2o.entity.ShopCategory;
import com.yihuschool.o2o.enums.ShopStateEnum;

public class ShopServiceTest extends BaseTest{
	
	@Autowired
	private ShopService shopService;
	
	@Test
	public void testAddShop() throws FileNotFoundException {
		Shop shop=new Shop();
		PersonInfo owner=new PersonInfo();
		Area area=new Area();
		ShopCategory shopCategory=new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(1);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试的店铺3");
		shop.setShopDesc("test_des c1");
		shop.setShopAddr("test_addr1");
		shop.setPhone("test_phone1");

		shop.setCreateTime(new Date());
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setAdvice("审核中");
		File shopImg=new File("C:\\Users\\Administrator\\Desktop\\test\\xiaoyitestnew.jpg");
		InputStream is=new FileInputStream(shopImg);
		ShopExecution se= shopService.addShop(shop, is,shopImg.getName());
		assertEquals(ShopStateEnum.CHECK.getState(), se.getState());
	}

}
