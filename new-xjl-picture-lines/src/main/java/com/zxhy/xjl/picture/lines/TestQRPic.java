package com.zxhy.xjl.picture.lines;

import java.io.File;

import com.zxhy.xjl.picture.lines.Impl.QRPicServiceImpl;

public class TestQRPic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	QRPicServiceImpl qrpsl = new QRPicServiceImpl();
	//测试生成二维码图片
	//qrpsl.getQRPic("ZTEsoft", "d:/pic/logo.jpg", "d:/pic/newlogo.jpg", false, "D:/pic/b.jpg", 10, 10, 1.0f,5);
	//测试离线验证图片真伪
	qrpsl.offlineCheck("D:/pic/b.jpg", "D:/pic/b_bak.jpg",5);	
		
	}

}
