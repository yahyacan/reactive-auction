package com.auction.repository;

import com.auction.domain.Bid;
import org.springframework.data.repository.CrudRepository;

/**
 * @author yahya
 */
public interface BidRepository extends CrudRepository<Bid, Long> {

}
