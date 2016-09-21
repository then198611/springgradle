package com.h.user.model.database;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.List;

/**
 * Created by huangshuaihui on 16/9/2.
 */


@Entity
@Table(name = "movie", schema = "sampledb")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie {
    private int id;
    private String title;
    private Integer year;
    private int detail_id;
    private MovieDetail detail;
    private List<Star> star;

    public Movie() {
    }

    public Movie(String title, Integer year) {
        this.title = title;
        this.year = year;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

//    @Basic
//    @Column(name = "detail_id")
//    public int getDetail_id() {
//        return detail_id;
//    }
//
//    public void setDetail_id(int detail_id) {
//        this.detail_id = detail_id;
//    }

    @OneToOne
    @JoinColumn(name = "detail_id")
    public MovieDetail getDetail() {
        return detail;
    }

    public void setDetail(MovieDetail detail) {
        this.detail = detail;
    }

    @ManyToMany
    @JoinTable(
            name = "movie_star",
            joinColumns = @JoinColumn(name = "movie_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "star_id",referencedColumnName = "id")
    )
    public List<Star> getStar() {
        return star;
    }

    public void setStar(List<Star> star) {
        this.star = star;
    }

}
