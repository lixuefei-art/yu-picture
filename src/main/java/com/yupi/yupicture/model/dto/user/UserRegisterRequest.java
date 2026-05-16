package com.yupi.yupicture.model.dto.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -900164157830458024L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
