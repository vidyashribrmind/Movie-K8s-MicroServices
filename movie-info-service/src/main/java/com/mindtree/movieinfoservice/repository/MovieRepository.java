package com.mindtree.movieinfoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.movieinfoservice.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
