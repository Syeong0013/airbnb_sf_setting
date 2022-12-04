package com.sy.bnb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sy.bnb.dao.MainDAO;

@Service("mainService")
public class MainServiceImpl implements MainService{

	@Resource(name="mainDAO")
	private MainDAO mainDAO;
	
	@Override
	public String getNow() {
		String a = mainDAO.getNow();
		return a;
	}
}
