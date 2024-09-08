package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.memberset.MemberDto;
import com.example.repository.MemberDao;
import com.example.repository.TrainerDao;

@Service
public class MemberSerivceImpl implements MemberService{
	
	@Autowired private MemberDao memberDao;
	@Autowired private TrainerDao trainerDao;
	
	
	@Override
	public void createMember(MemberDto dto) {
		//memberdao의 create 메소드를 호출하여 데이터 베이스에 추가한다
		memberDao.create(dto);
		
	}

	@Override
	public void updateMember(int memberNum, MemberDto dto) {
		//update 메소드를 호출하여 멤버 정보 업데이트 
		memberDao.update(memberNum, dto);
		
	}

	@Override
	public void deleteMember(int memberNum) {
		//delete 메소드를 호출하여 멤버 정보 삭제
		memberDao.delete(memberNum);
		
	}

	@Override
	public void linkTrainerToMember(int memberNum, String trainerNum) {
		 
		memberDao.linkTrainer(memberNum, trainerNum);
	}

	@Override
	public void updateMemberInfo(MemberDto memberDto) {
		
		memberDao.update(memberDto.getMemberNum(), memberDto);
		
	}


}
