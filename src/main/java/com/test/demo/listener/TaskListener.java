package com.test.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskListener implements ServletContextListener {
	
	private static Logger logger = LoggerFactory.getLogger(TaskListener.class);


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		logger.info("触发成功"+Thread.currentThread().getId());


//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				logger.info("启动NR成功"+Thread.currentThread().getId());
//				while(true){
//					logger.info("这是一个runnable中的初始化方法"+Thread.currentThread().getId());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}	
//				
//			}
//		}).start();
		
	}
	
	
}
