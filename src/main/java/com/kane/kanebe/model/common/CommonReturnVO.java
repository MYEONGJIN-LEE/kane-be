package com.kane.kanebe.model.common;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@Builder
public class CommonReturnVO<T> {
    private String successOrNot;
    private String statusCode;
    private T data;
}
