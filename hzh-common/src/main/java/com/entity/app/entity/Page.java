package com.entity.app.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/2/1
 * @Version: 1.0
 * @Description: TODO()
 */
@Data
public class Page <T> implements Serializable {

    @ApiModelProperty(value = "页码，从1开始", example = "1", position = 1)
    private int pageNum;
    @ApiModelProperty(value = "页面大小", example = "10", position = 2)
    private int pageSize;
    @ApiModelProperty(value = "当前页的数量", position = 5)
    private int size;
    @ApiModelProperty(value = "开始行", position = 6)
    private int startRow;
    @ApiModelProperty(value = "最后行", position = 7)
    private int endRow;
    @ApiModelProperty(value = "数据总数", position = 4)
    private long total;
    @ApiModelProperty(value = "总页数", position = 3)
    private int pages;
    @ApiModelProperty(value = "数据", position = 8)
    private List<T> list;
    @ApiModelProperty(value = "", position = 9)
    private int prePage;
    @ApiModelProperty(value = "", position = 10)
    private int nextPage;
    @ApiModelProperty(value = "", position = 3)
    private boolean isFirstPage;
    @ApiModelProperty(value = "", position = 3)
    private boolean isLastPage;
    private boolean hasPreviousPage;
    private boolean hasNextPage;
    private int navigatePages;
    private int[] navigatepageNums;
    private int navigateFirstPage;
    private int navigateLastPage;

    public Page() {
        this.isFirstPage = false;
        this.isLastPage = false;
        this.hasPreviousPage = false;
        this.hasNextPage = false;
    }




}
