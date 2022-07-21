package com.shirisha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shirisha.dto.OrderDto;
import com.shirisha.entity.Order;
import com.shirisha.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orepo;
	public void addData(OrderDto odto)
	{
		Order ord=new Order();
		ord.setOrderid(odto.getOrderid());
		ord.setNm(odto.getNm());
		ord.setQty(odto.getQty());
		ord.setPrice(odto.getPrice());
		orepo.save(ord);
	}

}

