package com.kane.kanebe.model.pagination;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author kane
 * @apiNote pagehelper 사용으로 대체
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@SuperBuilder
public class PaginationResponseVO<T> {
    private Integer totalCount;
    private Integer pageSize;
    private Integer pageIndex;
    private Integer dataCount;
    private Boolean hasMore;
    private List<T> list;

    public Integer getDataCount() {
        return list.size();
    }

    public Boolean getHasMore() {
        return totalCount > pageSize * pageIndex ;
    }
}
