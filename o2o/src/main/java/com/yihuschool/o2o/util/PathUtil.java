package com.yihuschool.o2o.util;

public class PathUtil {
	private static String seperator = System.getProperty("file.separator");
	
	public static String getImgBasePath() {
		String os=System.getProperty("os.name");
		String basePath="";
		if(os.toLowerCase().startsWith("win")) {
			basePath="F:/eclipse/o2oschoolimage/";
		}else {
			basePath="/home/ditto/o2oschoolimage/";
		}
		basePath=basePath.replace("/", seperator);
		return basePath;
	}
	
	public static String getShopImagePath(long shopId) {
		String imagePath="upload/item/shop/"+shopId+"/";
		return imagePath.replace("/", seperator);
	}
}
