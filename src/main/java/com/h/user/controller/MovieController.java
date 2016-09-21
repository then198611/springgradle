package com.h.user.controller;

import com.h.user.model.database.Movie;
import com.h.user.model.database.WithoutDetail;
import com.h.user.model.wrapper.BaseWrapper;
import com.h.user.service.MovieService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by huangshuaihui on 16/9/2.
 */
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/movie/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取电影信息",nickname = "movie",response = Movie.class)
    public BaseWrapper get(@PathVariable int id){
        BaseWrapper wrapper = movieService.getMovie(id);
        return wrapper;
    }

    @RequestMapping(value="modify_movie/{id}",method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value = "修改电影信息",nickname = "modify_movie")
    public BaseWrapper save(@PathVariable int id,@RequestParam String title,@RequestParam int year){
        BaseWrapper wrapper = movieService.updateMovie(id,title,year);
        return wrapper;
    }

    @RequestMapping(value = "add_movie",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加电影",nickname = "add_movie")
    public BaseWrapper add(@RequestParam String title,@RequestParam int year){
        BaseWrapper wrapper = movieService.addMovie(title,year);
        return wrapper;
    }


    @RequestMapping(value = "/movie_no/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取电影信息(没有 详情)",nickname = "movie_without_detail",response = WithoutDetail.class)
    public BaseWrapper getM(@PathVariable int id){
        BaseWrapper wrapper = movieService.getMovieWithoutDetail(id);
        return wrapper;
    }


}
