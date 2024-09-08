package com.example.repository;

import java.util.List;

import com.example.memberset.TrainerDto;

public interface TrainerDao {
	
	public void create(TrainerDto dto);
	public TrainerDto getData(int userNum);
	public List<TrainerDto> getList(TrainerDto dto);
	public void update(int trainerNum, TrainerDto dto);
	public void delete(int trainerNum);
	public int getTrinerNum(int user_num);
	public TrainerDto getInfo(int triner_num);
}
