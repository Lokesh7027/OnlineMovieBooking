package com.lokesh.bookingplatform.browsemovie.controller;

import com.lokesh.bookingplatform.browsemovie.controller.pojo.SearchMovieReq;
import com.lokesh.bookingplatform.browsemovie.controller.pojo.SearchMovieResp;
import com.lokesh.bookingplatform.browsemovie.controller.pojo.service.SearchMovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/browse/movie")
@Validated
public class BrowseMovieController {

    @Autowired
    SearchMovieServiceImpl searchMovieService;

    @RequestMapping(value = "/v1/searchTheaterByCity",method = RequestMethod.GET)
    public SearchMovieResp searchTheaterByCity(@RequestParam(name = "city") String city,
                                        @RequestParam(name = "movieName") String movieName,
                                        @RequestParam(name = "showDate") String showDate,
                                        @RequestParam(name = "showTime" , required = false) String showTime,
                                        @RequestParam(name ="limit", required = false ) Integer limit,
                                        @RequestParam(name = "offset", required = false) Long offset
    ){
        SearchMovieReq searchMovieReq = new SearchMovieReq();
        searchMovieReq.setCity(city);
        searchMovieReq.setMovieName(movieName);
        searchMovieReq.setShowDate(showDate);
        searchMovieReq.setShowTime(showTime);
        searchMovieReq.setLimit(limit);
        searchMovieReq.setOffset(offset);
        return searchMovieService.getMovieSearchDeatails(searchMovieReq);
    }


}
