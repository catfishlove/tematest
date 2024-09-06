package com.example.repository;

import java.util.List;

import com.example.memberset.MemberDto;
import com.example.memberset.TrainerDto;
import com.example.memberset.UserDto;

public interface MemberDao {
	
	public void create(MemberDto dto);
	//특정 ID로 데이터를 조회
	public UserDto getData(int UserNum);
	public List<MemberDto> getList(MemberDto dto);
	public void update (int memberNum, MemberDto dto);
	public void delete (int memberNum);
	// public List<TrainerDto> getList2(TrainerDto dto);
	// 트레이너 연동 기능과 크게 연관이 없어 목록 조회를 일단 제외시킴 
	
	//public boolean trainerLinked(int memberNum);
	//멤버와 트레이너의 연동 확인
	public void linkTrainer(int memberNum, String trainerId);
	//멤버와 트레이너(유저아이디)를 연동
	public void unlinkTrainer(int memberNum);
	//멤버와 트레이너 연동 해제
}
