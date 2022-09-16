package com.lokesh.bookingplatform.browsemovie.controller.pojo;


import com.netflix.servo.publish.RegexMetricFilter;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Label;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

@Validated
@Getter
@Setter
public class SearchMovieReq {

    @Length(max = 1024)
    @NotBlank
    private String city;

    @Length(max = 255)
    private String movieName;

    @Length(max = 10)
    private String showDate;

    @Length(max = 5)
    private String showTime;

    @Length(max = 255)
    private String movieGenere;

    @Length(max = 255)
    private String movieLanguage;

    private Integer limit = 200;

    private Long offset = 0L;

}
