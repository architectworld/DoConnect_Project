package com.doconnect.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostAnswerDTO {

	@NotNull(message = "provide the user Id")
	private Long userId;
	@NotNull(message = "provide the Question Id")
	private Long questionId;
	@NotBlank(message = "Answer is needed")
	private String answer;
	
	
	
	
	
	public PostAnswerDTO() {
		super();
		
	}
	
	
	public PostAnswerDTO(@NotNull(message = "provide the user Id") Long userId,
			@NotNull(message = "provide the Question Id") Long questionId,
			@NotBlank(message = "Answer is needed") String answer) {
		super();
		this.userId = userId;
		this.questionId = questionId;
		this.answer = answer;
	}


	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
}
