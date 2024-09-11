package com.example.setting.memberset;

import java.time.LocalDateTime;

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
	private String name;
	private String email;
	private LocalDateTime createdAt;
	private String profileImageUrl;
}
