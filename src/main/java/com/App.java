package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// IOC
		// BeanFactory
		// ApplicationContext
		// 1) ClassPathXmlApplicationContext
		// 2) FileSystelXmlApplicationContext
		// 3) WebXmlApplicationContext

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);
		UserDao u1 = context.getBean("userDao", UserDao.class);
		UserDao u2 = context.getBean("userDao", UserDao.class);
		UserDao u3 = context.getBean("userDao", UserDao.class);
		UserDao u4 = context.getBean("userDao", UserDao.class);
//    	
		System.out.println(u1);// toString -> hashcode --> print hashcode -> memory address
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);

	}
}
