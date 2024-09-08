package com.example.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.memberset.MemberDto;
import com.example.memberset.TrainerDto;
import com.example.memberset.UserDto;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired private SqlSession session;

	@Override
	public void create(MemberDto dto) {
		
		session.insert("member.insert", dto);
		
	}

	@Override
	public UserDto getData(int userNum) {
		
		return session.selectOne("member.getData", userNum);
	}
	@Override
	public List<MemberDto> getList(MemberDto dto) {
		
		return session.selectList("member.getList", dto);
	}

	@Override
	public void update(int memberNum, MemberDto dto) {
		
		session.update("member.update", dto);
	}

	@Override
	public void delete(int memberNum) {
		
		session.delete("member.delete", memberNum);
		
	}
	
	/*
	@Override
	public List<TrainerDto> getList2(TrainerDto dto) {
		
		return session.selectList("trainer.getList", dto);
	}
	
	
	@Override
	public boolean trainerLinked(int memberNum) {
		// TODO Auto-generated method stub
		return false;
	}
	*/

	@Override
	public void linkTrainer(int memberNum, String TrainerId) {
		// TODO Auto-generated method stub
		
	}


}
