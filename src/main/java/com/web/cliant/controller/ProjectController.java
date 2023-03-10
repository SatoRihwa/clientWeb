package com.web.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.web.client.model.ProjectDisp;
import com.web.client.service.ProjectApiService;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectApiService ps;
	
	//　プロジェクト追加処理
	@PostMapping("/project")
	public String projectSubmit(Model model, @ModelAttribute ProjectDisp project) {
		ps.addProject(project);
		model.addAttribute("project", project);
		return "project";
	}
}
