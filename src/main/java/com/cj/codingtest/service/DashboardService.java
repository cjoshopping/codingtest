package com.cj.codingtest.service;

import java.util.List;

import com.cj.codingtest.model.DashboardPost;

public interface DashboardService {
	public List<DashboardPost> getList();
	public Integer register(DashboardPost dashboardPost);
}
