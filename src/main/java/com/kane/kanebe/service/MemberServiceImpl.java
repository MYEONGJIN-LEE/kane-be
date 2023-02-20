package com.kane.kanebe.service;

import com.buildcenter.common.exception.CommonException;
import com.kane.kanebe.model.member.MemberVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("SampleService")
public class MemberServiceImpl implements MemberService {
    public List<MemberVO> retrieveMembers() throws CommonException {
        MemberVO member_1 = MemberVO.builder().memberName("sample").emailAddress("sample@sample.com").build();
        MemberVO member_2 = MemberVO.builder().memberName("kane").emailAddress("kane@kane.com").build();

        List<MemberVO> list = new ArrayList<MemberVO>();
        list.add(member_1);
        list.add(member_2);

        return list;
    }

    public MemberVO retrieveMemberById(Integer id) throws CommonException {
        MemberVO member_1 = MemberVO.builder().memberName("sample").emailAddress("sample@sample.com").memberId(id).build();
        return member_1;
    }

    public MemberVO saveMember(MemberVO memberVO) throws CommonException {
        memberVO.setMemberId(1);
        return memberVO;
    }
}
