package com.sr.controllers;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sr.Repositories.Repo;
import com.sr.entities.AssistantS;
import com.sr.entities.Validate;



@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private Validate valid;
	
	@Autowired
	private Repo repo;
	
	
	
@GetMapping("/show")
public String get(@ModelAttribute("image") AssistantS assistant ) {
	
	return "file";
}

@PostMapping("/in")
public String insert (@ModelAttribute("image") AssistantS asst,BindingResult errors) {
	
	
	
	if(valid.supports(AssistantS.class)){
		valid.validate(asst, errors);
		if(errors.hasErrors()) {
			return "file";
		}
	}
	repo.save(asst);
	return "redirect:report";
}


@GetMapping("/report")

public String add(Map<String,List<AssistantS>> map) {
map.put("list",	repo.findAll());
	return "add";
	
}


@GetMapping("update")
public String update(@RequestParam("id") Integer id, Map<String,AssistantS> map) {
	
     map.put("asst",   repo.findById(id).get());

	return "update";
	
}


@PostMapping("/update")
public String edit(@ModelAttribute("asst") AssistantS asst) {
	
	repo.save(asst);
	return"redirect:report";
	
	
}


}


