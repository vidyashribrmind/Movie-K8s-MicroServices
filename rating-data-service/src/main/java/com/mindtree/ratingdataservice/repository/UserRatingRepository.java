package com.mindtree.ratingdataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ratingdataservice.entity.UserRating;

@Repository
public interface UserRatingRepository extends JpaRepository<UserRating, Integer>{

	
}
