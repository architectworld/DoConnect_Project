package com.doconnect.dto;

/**
*
*@author kunal
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {

	private String msg;
	
	
	

	public ResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public ResponseDTO(String msg) {
		super();
		this.msg = msg;
	}



	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
