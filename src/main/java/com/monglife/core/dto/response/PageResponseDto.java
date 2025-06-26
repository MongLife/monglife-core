package com.monglife.core.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PageResponseDto<T> extends ResponseDto<T> {

    private Integer page;

    private Integer size;

    private Integer totalPage;

    private Boolean isLastPage;

    public PageResponseDto(String code, String message, Integer httpStatus, T result, Integer page, Integer size, Integer totalPage, Boolean isLastPage) {
        super(code, message, httpStatus, result);
        this.page = page;
        this.size = size;
        this.totalPage = totalPage;
        this.isLastPage = isLastPage;
    }
}
