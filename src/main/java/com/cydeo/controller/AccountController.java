package com.cydeo.controller;


import com.cydeo.client.CurrencyClient;
import com.cydeo.dto.AccountDTO;
import com.cydeo.dto.ResponseWrapper;
import com.cydeo.dto.response.CurrencyData;
import com.cydeo.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    private final AccountService accountService;
    private final CurrencyClient currencyClient;

    public AccountController(AccountService accountService, CurrencyClient currencyClient) {
        this.accountService = accountService;
        this.currencyClient = currencyClient;
    }


    @GetMapping("/all/{username}")
    public ResponseEntity<ResponseWrapper> getAllAccountsByUsername(@PathVariable("username") String username){

        return ResponseEntity.ok(ResponseWrapper.builder()
                .success(true)
                .message("Accounts are successfully retrieved.")
                .code(HttpStatus.OK.value()).data(accountService.findAllByUsername(username))
                .build());

    }

    @GetMapping("/all/currencies/{username}")
    public ResponseEntity<ResponseWrapper> getAllAccountsByUsernameAndCurrencies(@PathVariable("username") String username,
                                                                                 @RequestParam("currencies") List<String> currencies){
        return ResponseEntity.ok(ResponseWrapper.builder()
                .success(true)
                .message("Accounts are successfully retrieved.")
                .code(HttpStatus.OK.value())
                .data(accountService.findAllByUsernameAndCurrencyList(username,currencies)).build());
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseWrapper> createAccount(@RequestBody AccountDTO accountDTO){

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ResponseWrapper.builder().success(true)
                        .message("Account is successfully created.")
                        .code(HttpStatus.CREATED.value())
                        .data(accountService.create(accountDTO))
                        .build());

    }


}
