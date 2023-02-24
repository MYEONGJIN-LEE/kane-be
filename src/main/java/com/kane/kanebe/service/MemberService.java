package com.kane.kanebe.service;

import com.buildcenter.common.exception.CommonException;
import com.kane.kanebe.model.member.MemberVO;
import com.kane.kanebe.model.pagination.PaginationRequestVO;
import com.kane.kanebe.model.pagination.PaginationResponseVO;

import java.util.List;

public interface MemberService {
    List<MemberVO> retrieveMembers() throws CommonException;

    MemberVO retrieveMemberById(Integer id) throws CommonException;

    MemberVO saveMember(MemberVO memberVO) throws CommonException;
}
