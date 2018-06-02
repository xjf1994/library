package com.telecom.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/com/telecom/config/spring/*.xml"})
public class JTest {


	
	@Test
	public void testExportExcel(){
		System.out.println("1");
	}
	
}
