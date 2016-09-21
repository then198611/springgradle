package com.h.user.model.database;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by huangshuaihui on 16/9/2.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface WithoutDetail {

    public int getId();
    public String getTitle();
    public Integer getYear();

//    @JsonIgnore
//    public String getDecoratedClass();
}
