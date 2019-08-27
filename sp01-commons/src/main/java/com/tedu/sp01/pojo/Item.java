package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private Integer id;
	private String name;
	private Integer number;
	public Item(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public Item setId(Integer id) {
		this.id = id;return this;
	}
	public String getName() {
		return name;
	}
	public Item setName(String name) {
		this.name = name;return this;
	}
	public Integer getNumber() {
		return number;
	}
	public Item setNumber(Integer number) {
		this.number = number;return this;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
}
