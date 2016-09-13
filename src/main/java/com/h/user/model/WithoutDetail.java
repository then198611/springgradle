package com.h.user.model;

/**
 * Created by huangshuaihui on 16/9/2.
 */
//@Projection(name = "withoutDetail", types = { Movie.class })
public interface WithoutDetail {

    public int getId();
    public String getTitle();
    public Integer getYear();
}
