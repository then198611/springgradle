package com.h.user.service.impl;

import com.h.user.dao.movie.IMovieRepository;
import com.h.user.lib.BaseConfig;
import com.h.user.model.database.Movie;
import com.h.user.model.database.WithoutDetail;
import com.h.user.model.wrapper.BaseWrapper;
import com.h.user.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huangshuaihui on 16/9/14.
 */

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private IMovieRepository iMovieRepository;

    public BaseWrapper getMovie(int id) {
        Movie movie = iMovieRepository.findOne(id);
        return new BaseWrapper(BaseConfig.ResponseCode.CODE_SUCCESS,BaseConfig.ResponseMessage.MESSAGE_SUCCESS,movie);
    }

    public BaseWrapper updateMovie(int id,String title, int year) {
        if(iMovieRepository.exists(id)) {
            int code = iMovieRepository.diyModify(id,title, year);
            return code > 0 ? new BaseWrapper(BaseConfig.ResponseCode.CODE_SUCCESS,BaseConfig.ResponseMessage.MESSAGE_SUCCESS) :new BaseWrapper(BaseConfig.ResponseCode.CODE_BUSINESS_ERROR,BaseConfig.ResponseMessage.MESSAGE_BUSINESS_ERROR);
        }
        else{
            return new BaseWrapper(BaseConfig.ResponseCode.CODE_BUSINESS_ERROR,"不存在id"+id);
        }
    }

    public BaseWrapper addMovie(String title, int year) {
        Movie movie = iMovieRepository.save(new Movie(title,year));
        return new BaseWrapper(BaseConfig.ResponseCode.CODE_SUCCESS,BaseConfig.ResponseMessage.MESSAGE_SUCCESS,movie);
    }

    public BaseWrapper getMovieWithoutDetail(int id) {
        WithoutDetail withoutDetail = iMovieRepository.diyFind(id);
        return new BaseWrapper(BaseConfig.ResponseCode.CODE_SUCCESS,BaseConfig.ResponseMessage.MESSAGE_SUCCESS,withoutDetail);
    }
}
