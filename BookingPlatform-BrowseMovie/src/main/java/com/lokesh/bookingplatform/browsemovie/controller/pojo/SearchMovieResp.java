package com.lokesh.bookingplatform.browsemovie.controller.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;



@Getter
@Setter
public class SearchMovieResp {


    private Integer resultCode = 0;

    private String message;

    private Long totalRecords;

    private Long offset;

    private Integer limit;

    @JsonProperty("list")
    List<MovieBrief> movieBriefList;


}
