package com.kane.kanebe.model.member;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kane.kanebe.annotation.Nickname;
import com.kane.kanebe.annotation.PhoneNumber;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@Builder
public class MemberVO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String memberUuid;

    @NotBlank
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String memberName;

    @Email
    @NotBlank
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String emailAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String provider;

    @Nickname
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nickname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String introduce;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String snsUrl;

    @PhoneNumber
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String profileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer levelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String memberStateCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String roleTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String blackMemberYn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String blackMemberUpdatedDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String passwordHistory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer passwordWrongCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String passwordLastModifiedDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastLoginDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer createMemberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer updateMemberId;

}
