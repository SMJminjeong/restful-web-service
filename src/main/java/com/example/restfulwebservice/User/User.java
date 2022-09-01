package com.example.restfulwebservice.User;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
public class User { //Lombok사용으로 간단하게 선언만 해줌
    private Integer id;

    // 유효성 체크
    @Size
    private String name;
    private Date joinDate;
}