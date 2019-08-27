package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id;
	private User user;
	private List<Item> items;
	public String getId() {
		return id;
	}
	public Order setId(String id) {
		this.id = id;return this;
	}
	public User getUser() {
		return user;
	}
	public Order setUser(User user) {
		this.user = user;return this;
	}
	public List<Item> getItems() {
		return items;
	}
	public Order setItems(List<Item> items) {
		this.items = items;return this;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", items=" + items + "]";
	}
}
