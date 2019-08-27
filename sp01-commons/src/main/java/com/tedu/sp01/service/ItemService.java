package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 根据订单id查询商品列表
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}