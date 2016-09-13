package com.h.user.model;

import javax.persistence.*;

/**
 * Created by huangshuaihui on 16/9/2.
 */
@Entity
@Table(name = "movie_detail", schema = "sampledb", catalog = "")
public class MovieDetail {
    private int id;
    private String desc;
    private Movie movie;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @OneToOne
    @JoinColumn(name = "id")
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        MovieDetail that = (MovieDetail) o;
//
//        if (id != that.id) return false;
//        if (desc != null ? !desc.equals(that.desc) : that.desc != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (desc != null ? desc.hashCode() : 0);
//        return result;
//    }
}
