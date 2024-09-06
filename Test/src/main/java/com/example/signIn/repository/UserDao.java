package com.example.signIn.repository;

import com.example.signIn.dto.UserDto;

public interface UserDao {
	public UserDto getData(int id);
	//사용자의 정보를 ID로 조회
	public void create (UserDto user);
	//사용자의 정보를 추가
	void update (int id, UserDto data);
	//사용자 정보 업데이트
	void delete (int id);
	//사용자 정보 삭제
	
	

}
