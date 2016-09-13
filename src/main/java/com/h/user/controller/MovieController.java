package com.h.user.controller;

import com.h.user.dao.movie.IMovieRepository;
import com.h.user.model.Movie;
import com.h.user.model.WithoutDetail;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by huangshuaihui on 16/9/2.
 */
@RestController
public class MovieController {

    @Autowired
    private IMovieRepository iMovieRepository;

    @RequestMapping(value = "/movie/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "movie",nickname = "movie")
    public Movie get(@PathVariable int id){
        Movie movie = iMovieRepository.findOne(id);
        System.out.println("ceshi....");
        return movie;
    }

    @RequestMapping(value = "/movie_no/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "movie_without_detail",nickname = "movie_without_detail")
    public WithoutDetail getM(@PathVariable int id){
        WithoutDetail movie = iMovieRepository.findById(id);
        return movie;
    }
}
