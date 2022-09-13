package com.example.userservice.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
// @AllArgsConstructor 아규먼트를 다 가지고 있는 생성자
// @NoArgsConstructor 아무거도 없는 디폴트 생성자
public class Greeting {
	@Value("${greeting.message}")
	private String message;
}
