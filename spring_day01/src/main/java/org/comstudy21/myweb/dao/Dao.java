package org.comstudy21.myweb.dao;

import java.util.List;

import org.comstudy21.myweb.dto.SaramDto;

public interface Dao {
	
	public List<SaramDto> selectAll();
	
	public SaramDto selectOne(SaramDto dto);
	
	public void updateSaram(SaramDto dto);
	
	public void deleteSaram(SaramDto dto);
	
	public void insertSaram(SaramDto dto);
}
