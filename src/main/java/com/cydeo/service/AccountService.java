package com.cydeo.service;

import com.cydeo.dto.AccountDTO;
import com.cydeo.dto.response.CurrencyData;
import com.cydeo.dto.response.CurrencyResponse;

import java.util.List;

public interface AccountService {

    List<AccountDTO> findAllByUsername(String username);

    AccountDTO create (AccountDTO accountDTO);

    List<AccountDTO> findAllByUsernameAndCurrencyList(String username, List<String> currencies);

}
