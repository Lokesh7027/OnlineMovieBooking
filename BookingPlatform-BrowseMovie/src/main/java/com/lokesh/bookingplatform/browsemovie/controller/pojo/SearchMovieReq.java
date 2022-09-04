package com.lokesh.bookingplatform.browsemovie.controller.pojo;


import jakarta.validation.constraints.NotBlank;
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
    String city;

    @Length(max = 255)
    String movieName;

    @Length(max = 255)
    String movieGenere;

    @Length(max = 255)
    String movieLanguage;

}
