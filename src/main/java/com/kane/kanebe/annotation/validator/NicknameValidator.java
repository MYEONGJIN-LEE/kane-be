package com.kane.kanebe.annotation.validator;

import com.kane.kanebe.annotation.Nickname;
import com.kane.kanebe.utility.ValidateUtility;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NicknameValidator implements ConstraintValidator<Nickname, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null ? ValidateUtility.checkNicknameFormat(value) : true;
    }
}
