package com.cj.codingtest.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cj.codingtest.model.DashboardPost;

@Mapper
public interface DashboardRepository {
	public List<DashboardPost> selectAll();
	public Integer insert(DashboardPost dashboardPost);
}
