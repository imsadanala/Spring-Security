package com.ss.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.ss.dto.FilterBean;

@RestController
public class FilterController {

	@GetMapping(value = "/filter")
	public FilterBean getBean() {
		FilterBean filterBean = new FilterBean("value1", "value2", "value3");
		MappingJacksonValue mappingJackson = new MappingJacksonValue(filterBean);
		SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("field1",
				"field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("", simpleBeanPropertyFilter);
		mappingJackson.setFilters(filters);
		return filterBean;
	}

	@GetMapping(value = "/filters")
	public List<FilterBean> getBeanList() {
		return Arrays.asList(new FilterBean("value1", "value2", "value3"),
				new FilterBean("value4", "value5", "value6"));
	}
}
