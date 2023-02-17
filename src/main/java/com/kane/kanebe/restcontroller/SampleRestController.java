package com.kane.kanebe.restcontroller;

import com.buildcenter.common.exception.CommonException;
import com.kane.kanebe.constants.ResponseEntityConstants;
import com.kane.kanebe.constants.StatusCodeConstants;
import com.kane.kanebe.model.common.CommonReturnVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
public class SampleRestController {

    @ApiOperation(value = "샘플조회", httpMethod = "GET", notes = "샘플조회")
    @GetMapping(path = "/v1/sample", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonReturnVO> retrieveSample() throws CommonException {
        return new ResponseEntity<>(
                CommonReturnVO.builder()
                        .successOrNot(ResponseEntityConstants.SUCCESS_YES_FLAG)
                        .statusCode(StatusCodeConstants.OK)
                        .build(),
                OK);
    }

}
