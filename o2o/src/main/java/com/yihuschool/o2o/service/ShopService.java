package com.yihuschool.o2o.service;

import java.io.File;
import java.io.InputStream;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.yihuschool.o2o.dto.ShopExecution;
import com.yihuschool.o2o.entity.Shop;

public interface ShopService {

	ShopExecution addShop(Shop shop, InputStream shopImgInputStream,String fileName) throws RuntimeException;
}
