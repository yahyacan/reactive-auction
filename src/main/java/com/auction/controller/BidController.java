package com.auction.controller;

import com.auction.domain.Bid;
import com.auction.service.BidService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

/**
 * @author yahya
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("bids")
public class BidController {

    private final BidService bidService;

    @PutMapping
    public ResponseEntity<Bid> update(@RequestBody Bid bid) {
        return new ResponseEntity<Bid>(bidService.update(bid), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Bid> streamById(@PathVariable Long id) {
        return Flux.fromStream(Stream.generate(() -> bidService.findById(id)))
                .delayElements(Duration.ofMillis(10));
    }

}
