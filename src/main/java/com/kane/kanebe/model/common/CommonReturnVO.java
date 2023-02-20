package com.kane.kanebe.model.common;

import com.kane.kanebe.model.member.MemberVO;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * @author kane
 * hateoas 기능을 사용하기위해 RepresentationModel 클래스를 상속받은 클래스를 구현
 */

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@Builder
public class CommonReturnVO<T> extends RepresentationModel<CommonReturnVO<T>> {
    private String successOrNot;
    private String statusCode;
    private T data;
}
