package com.ss.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.dto.FilterBean;

@RestController
public class FilterController {

	@GetMapping(value = "/filter")
	public FilterBean getBean() {
		FilterBean bean = new FilterBean();
		bean.setField1("value1");
		bean.setField2("value2");
		bean.setField3("value3");
		return bean;
	}

	@GetMapping(value = "/filters")
	public List<FilterBean> getBeanList() {
		return Arrays.asList(new FilterBean("value1", "value2", "value3"),
				new FilterBean("value4", "value5", "value6"));
	}
}
