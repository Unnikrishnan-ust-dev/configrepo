package com.ust.iocday2;

import java.util.logging.Logger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestShapes {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("TestShapes");
		
//		BeanFactory factory1 = new FileSystemXmlApplicationContext("beans.xml");
		BeanFactory factory2 = new FileSystemXmlApplicationContext("beans.xml");
//		logger.info(factory1.toString());
//		
//		Shape rect1 = (Rectangle) factory1.getBean("rect");
//		Shape rect2 = (Rectangle) factory1.getBean("rect");
//		logger.info((rect1==rect2)+" rectangle");
//		
//		Shape tri1 = (Triangle) factory2.getBean("triangle");
//		Shape tri2 = (Triangle) factory2.getBean("triangle");
//		logger.info((tri1==tri2)+" triangle");
		
		ClassPathXmlApplicationContext factory3 = new ClassPathXmlApplicationContext("beans.xml");
		Shape rect3 = (Rectangle) factory3.getBean("rect");
		logger.info(rect3.toString());
		factory3.registerShutdownHook();
	}
}
