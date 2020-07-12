package com.example.msscbrewery.web.service;

import com.example.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by ch on 2020-07-12
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}

