package com.kane.kanebe.restcontroller;

import com.buildcenter.common.exception.CommonException;
import com.kane.kanebe.constants.ResponseEntityConstants;
import com.kane.kanebe.constants.StatusCodeConstants;
import com.kane.kanebe.model.common.CommonReturnVO;
import com.kane.kanebe.model.member.MemberVO;
import com.kane.kanebe.service.MemberService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberRestController {

    private final MemberService memberService;

    @ApiOperation(value = "멤버리스트조회", httpMethod = "GET", notes = "멤버리스트조회")
    @GetMapping(path = "/v1/members", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonReturnVO<List<MemberVO>>> retrieveMembers() throws CommonException {
        return new ResponseEntity<>(
                CommonReturnVO.<List<MemberVO>>builder()
                        .successOrNot(ResponseEntityConstants.SUCCESS_YES_FLAG)
                        .statusCode(StatusCodeConstants.OK)
                        .data(memberService.retrieveMembers())
                        .build(),
                OK);
    }

    @ApiOperation(value = "멤버조회", httpMethod = "GET", notes = "멤버조회")
    @GetMapping(path = "/v1/members/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonReturnVO<MemberVO>> retrieveMemberById(@PathVariable(name = "id") Integer id) throws CommonException {
        return new ResponseEntity<>(
                CommonReturnVO.<MemberVO>builder()
                        .successOrNot(ResponseEntityConstants.SUCCESS_YES_FLAG)
                        .statusCode(StatusCodeConstants.OK)
                        .data(memberService.retrieveMemberById(id))
                        .build(),
                OK);
    }

    @ApiOperation(value = "멤버저장", httpMethod = "POST", notes = "멤버저장")
    @PostMapping(path = "/v1/member", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonReturnVO<MemberVO>> saveMember(@RequestBody MemberVO memberVO) throws CommonException {
        return new ResponseEntity<>(
                CommonReturnVO.<MemberVO>builder()
                        .successOrNot(ResponseEntityConstants.SUCCESS_YES_FLAG)
                        .statusCode(StatusCodeConstants.OK)
                        .data(memberService.saveMember(memberVO))
                        .build(),
                OK);

    }
}
