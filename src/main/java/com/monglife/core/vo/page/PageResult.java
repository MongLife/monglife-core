package com.monglife.core.vo.page;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class PageResult<T> {

    private final Integer page;

    private final Integer size;

    private final Integer totalPage;

    private final Boolean isLastPage;

    private final List<T> result;

    @Builder
    public PageResult(Integer page, Integer size, Integer totalPage, Boolean isLastPage, List<T> result) {
        this.page = page;
        this.size = size;
        this.totalPage = totalPage;
        this.isLastPage = isLastPage;
        this.result = result;
    }
}
