package com.example.msscbrewery.web.service;

import com.example.msscbrewery.web.model.BeerDto;
import com.example.msscbrewery.web.model.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by ch on 2020-07-12
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
        //todo impl
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
        //todo impl
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl
    }

    @Override
    public void deleteById(UUID beerId) {
        //todo impl
    }
}
