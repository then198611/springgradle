package com.h.user.dao.movie;

import com.h.user.model.database.MovieDetail;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by huangshuaihui on 16/9/12.
 */
public interface IMovieDetailRepository extends CrudRepository<MovieDetail,Integer> {

}
