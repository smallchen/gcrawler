package com.greedchina.gcrawler.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Gcrawler {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String index() {
		return "index";
    }

}
