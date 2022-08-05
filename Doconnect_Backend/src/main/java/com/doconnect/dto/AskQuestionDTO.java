package com.doconnect.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AskQuestionDTO {

	@NotNull(message = "provide the id")
	private Long userId;
	@NotBlank(message = "Question is required")
	private String question;
	@NotBlank(message = "provide the topic")
	private String topic;
	
	
	
	
	public AskQuestionDTO() {
		super();
		
	}
	
	
	
	public AskQuestionDTO(@NotNull(message = "provide the id") Long userId,
			@NotBlank(message = "Question is required") String question,
			@NotBlank(message = "provide the topic") String topic) {
		super();
		this.userId = userId;
		this.question = question;
		this.topic = topic;
	}



	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
	

}
