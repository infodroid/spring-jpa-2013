package com.classofjava.sso;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.classofjava.sso.service.ReportService;

public class Main {

	public static void main(String ar[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "META-INF/applicationContext.xml" });
		ReportService bean = applicationContext.getBean("reportService",
				ReportService.class);
		bean.export();

	}
}
