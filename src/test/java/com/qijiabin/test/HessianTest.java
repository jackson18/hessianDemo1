package com.qijiabin.test;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

import hessianDemo1.DemoApi;

/**
 * ========================================================
 * 日 期：2016年6月23日 上午10:40:57
 * 作 者：qijiabin
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class HessianTest {

	public static void main(String[] args) {
		try {
			String url = "http://localhost:8080/hessianDemo1/helloworld";
			HessianProxyFactory proxy = new HessianProxyFactory();
			DemoApi api = (DemoApi) proxy.create(url);
			api.setName("test");
			System.out.println(api.sayHello());
			System.out.println(api.getUser());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
