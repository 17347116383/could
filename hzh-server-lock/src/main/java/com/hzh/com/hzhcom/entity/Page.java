package com.hzh.com.hzhcom.entity;

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
    @ApiModelProperty(value = "当前页", position = 9)
    private int prePage;
    @ApiModelProperty(value = "下一页", position = 10)
    private int nextPage;
    @ApiModelProperty(value = "第一页", position = 11)
    private boolean isFirstPage;
    @ApiModelProperty(value = "上一页", position =12)
    private boolean isLastPage;
    @ApiModelProperty(value = "前一页", position = 13)
    private boolean hasPreviousPage;
    @ApiModelProperty(value = "后一页", position = 14)
    private boolean hasNextPage;
    @ApiModelProperty(value = "", position = 15)
    private int navigatePages;
    @ApiModelProperty(value = "", position = 16)
    private int[] navigatepageNums;
    @ApiModelProperty(value = "", position = 17)
    private int navigateFirstPage;
    @ApiModelProperty(value = "", position = 18)
    private int navigateLastPage;

    public Page() {
        this.isFirstPage = false;
        this.isLastPage = false;
        this.hasPreviousPage = false;
        this.hasNextPage = false;
    }




}
