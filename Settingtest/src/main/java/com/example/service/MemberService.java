package com.example.service;

import com.example.memberset.MemberDto;

public interface MemberService {
	
		public void createMember(MemberDto dto);
		//사용자 추가 메소드
		public void updateMember(int memberNum, MemberDto dto);
		//멤버 수정 메소드
		public void deleteMember(int memberNum);
		//멤버 삭제 메소드 
		public void linkTrainerToMember(int memberNum, String trainerNum);
		//멤버와 트레이너 연동
		public void updateMemberInfo(MemberDto memberDto);
		//멤버 설정 저장 메소드
		public void linkTrainer(String userId);
		//트레이너 멤버 연동 메소드
	

}

