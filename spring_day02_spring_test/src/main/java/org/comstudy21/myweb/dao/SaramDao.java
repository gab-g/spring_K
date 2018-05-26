package org.comstudy21.myweb.dao;

import org.comstudy21.myweb.dto.Saram;
import org.mybatis.spring.SqlSessionTemplate;

public class SaramDao {
	private SqlSessionTemplate myBatis;

	public SqlSessionTemplate getMyBatis() {
		return myBatis;
	}

	public void setMyBatis(SqlSessionTemplate myBatis) {
		this.myBatis = myBatis;
	}
	
	public Saram getById(String id) {
		try {
			  Saram saram = myBatis.selectOne("SaramMapper.selectSaram", "HONG");
			  System.out.println(saram);
			  return saram;
			} finally {	}
	}
}
