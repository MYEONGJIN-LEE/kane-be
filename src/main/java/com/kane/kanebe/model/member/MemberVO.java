package com.kane.kanebe.model.member;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MemberVO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String memberUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String memberName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nickname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String introduce;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String snsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String emailAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String genderCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ageGroupCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String birthYear;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String profileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String profileBackgroundColor;

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
    private String lastLogoutDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer createMemberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updateDatetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer updateMemberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdDateTime;
}
