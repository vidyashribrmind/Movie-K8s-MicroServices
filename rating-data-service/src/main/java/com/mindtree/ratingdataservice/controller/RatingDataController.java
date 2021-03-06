package com.mindtree.ratingdataservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ratingdataservice.dto.RatingDto;
import com.mindtree.ratingdataservice.dto.RatingListDto;
import com.mindtree.ratingdataservice.dto.UserRatingDto;
import com.mindtree.ratingdataservice.entity.Rating;
import com.mindtree.ratingdataservice.entity.UserRating;
import com.mindtree.ratingdataservice.service.RatingDataService;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataController {

	@Autowired
	RatingDataService ratingService;
	
	@GetMapping("/movies/{movieId}")
	public RatingDto getMovieRating(@PathVariable("movieId") int movieId) {
		//System.out.println(movieId);
		return ratingService.getMovieRating(movieId);	
	}

	@GetMapping("/user/{userId}")
	public UserRatingDto getUserRatings(@PathVariable("userId") int userId) {
		return ratingService.getUserRatings(userId);
		
	}
	
	@PostMapping("/addRating")
	public RatingDto addRating(@RequestBody RatingDto rating) {
		return ratingService.addRating(rating);
	}
	
	@PostMapping("/adduser")
	public UserRatingDto addUser(@RequestBody UserRatingDto rating) {
		return ratingService.adduserRating(rating);
	}
	
	
	@GetMapping("/rating")
	public List<RatingDto> getAllRating() {
		return ratingService.getAvgRatings();
		
	}

}
