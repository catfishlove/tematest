package com.example.setting.service;

import com.example.setting.memberset.TrainerDto;

public interface TrainerService {
	public TrainerDto createTrainer(TrainerDto dto);
	public void updateTrainer(TrainerDto dto);
	public void deleteTrainer(int trainerNum);

}
