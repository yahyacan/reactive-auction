package com.auction.service;

import com.auction.domain.Bid;
import com.auction.repository.BidRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author yahya
 */
@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "bids")
public class BidService {

    private final BidRepository bidRepository;

    @Cacheable(value = "bids", key = "#id")
    public Bid findById(Long id){
        Optional<Bid> optionalBid = bidRepository.findById(id);
        if (optionalBid.isPresent()){
            return optionalBid.get();
        }
        return null;
    }

    @CacheEvict(value = "bids", key = "#bid.id")
    public Bid update(Bid bid){
        return bidRepository.save(bid);
    }

}
