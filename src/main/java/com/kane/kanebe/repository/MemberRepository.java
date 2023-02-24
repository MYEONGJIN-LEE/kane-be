package com.kane.kanebe.repository;

import com.buildcenter.common.exception.CommonException;
import com.kane.kanebe.model.member.MemberVO;
import com.kane.kanebe.model.pagination.PaginationRequestVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface MemberRepository {
    @Transactional(readOnly = true)
    List<MemberVO> retrieveMembers() throws CommonException;

    @Transactional(readOnly = true)
    MemberVO retrieveMemberById(Integer id) throws CommonException;

    int saveMember(MemberVO memberVO) throws CommonException;
}
