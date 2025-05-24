
package com.fullstack.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "CountryService", url = "https://jsonmock.hackerrank.com/api/countries?name=India")
public interface CountryClient {

    @GetMapping("/")
    public String getCountryInfo();
}
