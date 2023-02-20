package com.kane.kanebe.service;

import com.buildcenter.common.exception.CommonException;
import com.kane.kanebe.model.member.MemberVO;

import java.util.List;

public interface MemberService {
    public List<MemberVO> retrieveMembers() throws CommonException;

    public MemberVO retrieveMemberById(Integer id) throws CommonException;

    public MemberVO saveMember(MemberVO memberVO) throws CommonException;
}
