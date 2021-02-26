package com.ss.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "represents the user details")
public class User implements Serializable {

	private static final long serialVersionUID = 7004441380263390246L;

	private Integer id;

	@Size(min = 2)
	@ApiModelProperty(notes = "name atleast have 2 characters")
	private String name;

	@ApiModelProperty(notes = "Birthday can't be future")
	private Date birthDay;

	public User(Integer id, String name, Date birthDay) {
		super();
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDay=" + birthDay + "]";
	}

}
