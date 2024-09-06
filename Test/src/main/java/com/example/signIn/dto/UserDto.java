package com.example.signIn.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDto {
	
	private int userNum;
	private String userId;
	private String oauthId;
	private String Name;
	private String Email;
	private Timestamp createdAt;
	private String profileImage;
}
