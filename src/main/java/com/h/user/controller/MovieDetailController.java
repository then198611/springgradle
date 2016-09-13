package com.h.user.controller;

import com.h.user.dao.movie.IMovieDetailRepository;
import com.h.user.model.MovieDetail;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by huangshuaihui on 16/9/12.
 */
@RestController
public class MovieDetailController {

    @Autowired
    private IMovieDetailRepository iMovieDetailRepository;

    @RequestMapping(value = "/movie_detail/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "movie_detail",nickname = "movie_detail")
    public MovieDetail get(@PathVariable Integer id){
        MovieDetail movieDetail = iMovieDetailRepository.findOne(id);
        return movieDetail;
    }

}
