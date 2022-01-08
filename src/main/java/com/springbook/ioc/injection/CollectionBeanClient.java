package com.springbook.ioc.injection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		
		//List
//		List<String> addressList = bean.getAddressList();
		
		//Set
//		Set<String> addressList = bean.getAddressList();
		
		//Map
//		Map<String, String> addressList = bean.getAddressList();
//		
//		for(String name : addressList.keySet()) {
//			String address = (String) addressList.get(name);
//			System.out.println(name + " : " + address);
//		}
		
		//Properties
		Properties addressList = bean.getAddressList();
		
		for(Object name : addressList.keySet()) {
			String address = addressList.getProperty((String)name);
			System.out.println(name + " : " + address);
		}
		factory.close();
	}
}
