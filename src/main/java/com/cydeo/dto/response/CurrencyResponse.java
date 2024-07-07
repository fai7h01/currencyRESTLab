package com.cydeo.dto.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CurrencyResponse {

    private LocalDateTime dateTime;
    private boolean success;
    private HttpStatus httpStatus;
    private String message;
    private List<CurrencyData> data;

}
