package com.cydeo.client;

import com.cydeo.dto.response.CurrencyResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(url = "http://cydeodev.com/api/v1", name = "CURRENCY-CLIENT")
public interface CurrencyClient {

    @GetMapping("/currency/all")
    CurrencyResponse getAllCurrencies();

    @GetMapping("/currency/list")
    CurrencyResponse getListOfCurrencies(@RequestParam("currencies") List<String> currencies);




}
