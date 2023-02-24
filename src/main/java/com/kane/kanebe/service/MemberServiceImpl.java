package com.kane.kanebe.service;

import com.buildcenter.common.exception.CommonException;
import com.kane.kanebe.model.member.MemberVO;
import com.kane.kanebe.model.pagination.PaginationRequestVO;
import com.kane.kanebe.model.pagination.PaginationResponseVO;
import com.kane.kanebe.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MemberService")
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public List<MemberVO> retrieveMembers() throws CommonException {

        List<MemberVO> members = memberRepository.retrieveMembers();
        return members;
    }

    public MemberVO retrieveMemberById(Integer id) throws CommonException {

        MemberVO member = memberRepository.retrieveMemberById(id);
        return member;
    }

    public MemberVO saveMember(MemberVO memberVO) throws CommonException {

        memberRepository.saveMember(memberVO);
        return memberVO;
    }
}
