package com.auction.configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableCaching
public class AppConfig {
  @Bean
  public CacheManager cacheManager() {
      ConcurrentMapCacheManager cacheManager =
              new ConcurrentMapCacheManager("bids");
      return cacheManager;
  }
}