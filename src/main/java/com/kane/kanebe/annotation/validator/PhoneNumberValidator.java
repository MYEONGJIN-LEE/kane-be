package com.kane.kanebe.annotation.validator;


import com.kane.kanebe.annotation.PhoneNumber;
import com.kane.kanebe.utility.ValidateUtility;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null ? ValidateUtility.checkPhoneNumber(value) : true;
    }
}
