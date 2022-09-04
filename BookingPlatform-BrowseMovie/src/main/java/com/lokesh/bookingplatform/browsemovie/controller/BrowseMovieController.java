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

    @RequestMapping(value = "/v1/search",method = RequestMethod.POST)
    public SearchMovieResp getMovieData(@RequestBody SearchMovieReq searchMovieReq){
        return searchMovieService.getMovieSearchDeatails(searchMovieReq);
    }


}
