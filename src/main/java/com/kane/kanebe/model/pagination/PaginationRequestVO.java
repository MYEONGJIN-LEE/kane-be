package com.kane.kanebe.model.pagination;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author kane
 * @apiNote pagehelper 사용으로 대체
 * Pagination을 위한 VO
 * pagination 받을 requestVO에 @Superbuilder 설정 & extends PaginationRequestVo 상속 후 사용
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@SuperBuilder
public class PaginationRequestVO {

    @Builder.Default
    @Positive
    @ApiModelProperty(value = "목록 조회시 한번에 가져올 데이터 양",
            notes = "목록 조회시 한번에 가져올 데이터 양",
            example = "10")
    private Integer pageSize = 10;

    @Builder.Default
    @PositiveOrZero
    @ApiModelProperty(value = "데이터 조회 페이지 인덱스", notes = "데이터 조회 페이지 인덱스", example = "0")
    private Integer pageIndex = 0;

    private Integer start;
    private String sort;
    private String order;

    public Integer getStart() {
        long startIndex = (long) pageIndex * pageSize;
        return (startIndex > Integer.MAX_VALUE) ? Integer.MAX_VALUE : pageIndex * pageSize;
    }
}
