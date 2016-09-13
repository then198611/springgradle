package com.h.user.dao.movie;

import com.h.user.model.Movie;
import com.h.user.model.WithoutDetail;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by huangshuaihui on 16/9/2.
 */
//@RepositoryRestResource (itemResourceRel="movie", collectionResourceRel = "movie", path = "movie")
public interface IMovieRepository extends CrudRepository<Movie,Integer> {
    WithoutDetail findById(int id);
    Movie findMovieById(int id);
}
