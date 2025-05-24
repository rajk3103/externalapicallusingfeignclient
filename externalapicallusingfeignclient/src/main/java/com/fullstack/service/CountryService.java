
package com.fullstack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryClient countryClient;

    public String getCountryInfo(){
        return countryClient.getCountryInfo();
    }
}
