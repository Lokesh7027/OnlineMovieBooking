package com.lokesh.bookingplatform.browsemovie.controller.pojo.service;

import com.lokesh.bookingplatform.browsemovie.controller.pojo.MovieBrief;
import com.lokesh.bookingplatform.browsemovie.controller.pojo.SearchMovieReq;
import com.lokesh.bookingplatform.browsemovie.controller.pojo.SearchMovieResp;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class SearchMovieServiceImpl {

    public SearchMovieResp getMovieSearchDeatails(SearchMovieReq searchMovieReq) {
        SearchMovieResp searchMovieResp = new SearchMovieResp();
        List<MovieBrief> movieBriefList = new ArrayList<>();
        MovieBrief movieBrief = new MovieBrief();
        movieBrief.setShowId("123");
        movieBrief.setTheaterName("xyz");

        MovieBrief movieBrief2 = new MovieBrief();
        movieBrief2.setShowId("568");
        movieBrief2.setTheaterName("pqr");
        movieBriefList.add(movieBrief);
        movieBriefList.add(movieBrief2);
        searchMovieResp.setMovieBriefList(movieBriefList);
        return searchMovieResp;
    }




}
