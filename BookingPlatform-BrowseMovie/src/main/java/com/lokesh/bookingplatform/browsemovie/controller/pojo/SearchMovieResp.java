package com.lokesh.bookingplatform.browsemovie.controller.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;



@Getter
@Setter
public class SearchMovieResp {

    @JsonProperty("list")
    List<MovieBrief> movieBriefList;


}
