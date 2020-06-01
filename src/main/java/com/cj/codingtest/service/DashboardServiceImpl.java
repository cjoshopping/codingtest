package com.cj.codingtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cj.codingtest.model.DashboardPost;
import com.cj.codingtest.repository.DashboardRepository;

@Service
public class DashboardServiceImpl implements DashboardService {

	@Autowired
	private DashboardRepository dashboardRepository;
	
	public void setDashboardRepository(DashboardRepository dashboardRepository) {
		this.dashboardRepository = dashboardRepository;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<DashboardPost> getList() {
		return dashboardRepository.selectAll();
	}

	@Override
	@Transactional
	public Integer register(DashboardPost dashboardPost) {
		return dashboardRepository.insert(dashboardPost);
	}
}
