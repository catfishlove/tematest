package com.example.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.memberset.TrainerDto;

@Repository
public class TrainerDaoImpl implements TrainerDao{
	
	@Autowired private SqlSession session;

	@Override
	public void create(TrainerDto dto) {
		
		session.insert("trainer.insert", dto);
		
	}

	@Override
	public TrainerDto getData(int userNum) {
		
		return session.selectOne("trainer.getData", userNum);
		
	}

	@Override
	public List<TrainerDto> getList(TrainerDto dto) {
		
		return session.selectList("trainer.getList", dto);
	}

	@Override
	public void update(int trainerNum, TrainerDto dto) {

		session.update("trainer.update", dto);
		
	}

	@Override
	public void delete(int trainerNum) {
		
		session.delete("trainer.delete", trainerNum);
		
	}

	@Override
	public int getTrinerNum(int user_num) {
		
		return TrainerMapper.selectTrinerNum(user_num);
	}

	@Override
	public TrainerDto getInfo(int triner_num) {
		return TrainerMapper.selectTrainerInfo(triner_num);
	}

}
