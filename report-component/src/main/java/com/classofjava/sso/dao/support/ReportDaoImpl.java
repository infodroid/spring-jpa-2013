package com.classofjava.sso.dao.support;

import com.classofjava.sso.dao.ReportDao;

public class ReportDaoImpl implements ReportDao {

	@Override
	public byte[] getData() {
		return "Monthly Report".getBytes();
	}

}
