package com.cj.codingtest.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cj.codingtest.model.DashboardPost;
import com.cj.codingtest.model.Json;
import com.cj.codingtest.service.DashboardService;

@RestController
@RequestMapping("/dashboard")
public class DashboardRestController {
	private static Logger logger = LoggerFactory.getLogger(DashboardRestController.class);
	@Autowired
	private DashboardService dashboardService;
	
	@GetMapping("/list")
	public Json<?> getList() {
		return Json.createJson(dashboardService.getList());
	}
	
	@PostMapping("/post")
	public Json<?> registPost(@ModelAttribute DashboardPost dashboardPost) {
		logger.info(dashboardPost.toString());
		return Json.createJson(dashboardService.register(dashboardPost));
	}
}
