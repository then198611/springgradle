package com.h.user.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by huangshuaihui on 16/9/2.
 */
@Entity
@Table(name = "movie", schema = "sampledb")
public class Movie {
    private int id;
    private String title;
    private Integer year;
    private MovieDetail detail;
    private List<Star> star;

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


    @OneToOne(cascade = CascadeType.ALL,mappedBy = "movie")
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

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Movie that = (Movie) o;
//
//        if (id != that.id) return false;
//        if (title != null ? !title.equals(that.title) : that.title != null) return false;
//        if (year != null ? !year.equals(that.year) : that.year != null) return false;
////        if (detailId != null ? !detailId.equals(that.detailId) : that.detailId != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (title != null ? title.hashCode() : 0);
//        result = 31 * result + (year != null ? year.hashCode() : 0);
////        result = 31 * result + (detailId != null ? detailId.hashCode() : 0);
//        return result;
//    }
}
