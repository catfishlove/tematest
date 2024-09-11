package com.example.setting.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.setting.memberset.TrainerDto;
import com.example.setting.repository.TrainerDao;

@Service
public class TrainerServiceImpl implements TrainerService{
	
	@Autowired private TrainerDao dao;

	@Override
	public TrainerDto createTrainer(TrainerDto dto) {
		dao.create(dto);
		return dto;
	}

	@Override
	public void updateTrainer(TrainerDto dto) {
		dao.update(dto);
		
	}

	@Override
	public void deleteTrainer(int trainerNum) {
		dao.delete(trainerNum);
		
	}

	

}
