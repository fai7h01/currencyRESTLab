package com.cydeo.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "http://cydeodev.com/api/v1", name = "CURRENCY-CLIENT")
public interface CurrencyClient {

}
