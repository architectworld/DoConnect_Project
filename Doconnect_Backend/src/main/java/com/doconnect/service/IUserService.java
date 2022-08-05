package com.doconnect.service;

import java.io.IOException;

/**
*
*@author kunal
*/

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.multipart.MultipartFile;

import com.doconnect.dto.AskQuestionDTO;
import com.doconnect.dto.PostAnswerDTO;
import com.doconnect.entity.Answer;
import com.doconnect.entity.ImageModel;
import com.doconnect.entity.Question;
import com.doconnect.entity.User;
import com.doconnect.vo.Message;

public interface IUserService {

	public User userLogin(String email, String password);

	public String userLogout(Long userId);

	public User userRegister(@Valid User user);

	public Question askQuestion(@Valid AskQuestionDTO askQuestionDTO);

	public Answer giveAnswer(@Valid PostAnswerDTO postAnswerDTO);

	public List<Question> searchQuestion(String question);

	public List<Answer> getAnswers(Long questionId);

	public List<Question> getQuestions(String topic);

	public BodyBuilder uplaodImage(MultipartFile file) throws IOException;

	public ImageModel getImage(String imageName);

	public Message sendMessage(@Valid Message message);

}
