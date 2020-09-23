package com.weiguofu.esjpademo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "game", type = "game")
@Data
public class Game implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String coverPic;

    private String introduce;

    private Integer kind;

    /**
     * 数量
     */
    private Integer counts;

    /**
     * 当前在使用数量
     */
    private Integer currentUse;

    private Integer rentTimes;

    private Integer views;

    private Date createTime;

    private Integer createUserId;

    private static final long serialVersionUID = 1L;
}