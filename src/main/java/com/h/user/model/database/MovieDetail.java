package com.h.user.model.database;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;

/**
 * Created by huangshuaihui on 16/9/2.
 */
@Entity
@Table(name = "movie_detail", schema = "sampledb", catalog = "")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieDetail {
    private int id;
    private String desc;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
