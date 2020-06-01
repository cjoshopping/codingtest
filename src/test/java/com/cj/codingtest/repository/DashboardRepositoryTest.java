package com.cj.codingtest.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cj.codingtest.model.DashboardPost;

@SpringBootTest
public class DashboardRepositoryTest {

	private static Logger logger = LoggerFactory.getLogger(DashboardRepositoryTest.class);
	
	@Autowired
	private DashboardRepository dashboardRepository;

	@Test
	public void test_selectAll() {
		List<DashboardPost> posts = dashboardRepository.selectAll();
		logger.info("post size : {}", posts.size());
	}
}
