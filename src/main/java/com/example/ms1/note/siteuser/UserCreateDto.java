package com.example.ms1.note.siteuser;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class UserCreateDto {

    @NotEmpty(message = "아이디를 입력해")
    private String loginId;
    @NotEmpty(message = "비밀번호를 입력해")
    private String password;
    @NotEmpty(message = "닉네임를 입력해")
    private String nickname;
    @NotEmpty(message = "이메일를 입력해")
    @Email(message = "이메일 형식을 다시봐줘")
    private String email;
}
