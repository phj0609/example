package me.hyun.config;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.hyun.mapper.TestMapper;

public class RootConfigTest extends AppTest{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	TestMapper testMapper;
	
	@Test
	public void dataSourceTest () {
		assertNotNull(dataSource);
	}
	
	@Test
	public void mapperTest() {
		System.out.println(testMapper.myTime());
	}

}
