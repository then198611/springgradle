package com.h.user.service;

import com.h.user.model.wrapper.BaseWrapper;

/**
 * Created by huangshuaihui on 16/9/14.
 */

public interface MovieService {

    BaseWrapper getMovie(int id);

    BaseWrapper updateMovie(int id,String title,int year);

    BaseWrapper addMovie(String title,int year);

    BaseWrapper getMovieWithoutDetail(int id);
}
