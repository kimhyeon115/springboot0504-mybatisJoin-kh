package com.rlagus.mybatisJoin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
	
	private String id;
	private String pw;
	private String name;
	private String email;

}
