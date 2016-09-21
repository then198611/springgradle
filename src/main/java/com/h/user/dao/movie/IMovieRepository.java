package com.h.user.dao.movie;

import com.h.user.model.database.Movie;
import com.h.user.model.database.WithoutDetail;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huangshuaihui on 16/9/2.
 */
//@RepositoryRestResource (itemResourceRel="movie", collectionResourceRel = "movie", path = "movie")
public interface IMovieRepository extends CrudRepository<Movie,Integer> {

    @Query("select m.id as id,m.title as title,m.year as year from Movie m where m.id = ?1")
    WithoutDetail diyFind(int id);

    @Query("update Movie m set m.title = ?2,m.year = ?3 where m.id = ?1")
    @Transactional
    @Modifying
    int diyModify(int id,String title,int year);

    WithoutDetail findById(int id);
    Movie findMovieById(int id);
}
