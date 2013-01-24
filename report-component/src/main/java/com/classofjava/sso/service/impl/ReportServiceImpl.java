package com.classofjava.sso.service.impl;

import com.classofjava.sso.dao.ReportDao;
import com.classofjava.sso.service.ReportService;

public class ReportServiceImpl implements ReportService {

	private ReportDao reportDao;

	@Override
	public void export() {
		byte[] data = reportDao.getData();
		System.out.println(new String(data));
	}

	public ReportDao getReportDao() {
		return reportDao;
	}

	public void setReportDao(ReportDao reportDao) {
		this.reportDao = reportDao;
	}
	
	

}
