//package com.auction.configuration;
//
//import io.r2dbc.spi.ConnectionFactories;
//import io.r2dbc.spi.ConnectionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
//import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
//
///**
// * @author yahya
// */
//@Configuration
//@EnableR2dbcRepositories
//public class MysqlApplicationConfiguration extends AbstractR2dbcConfiguration {
//    @Override
//    @Bean
//    public ConnectionFactory connectionFactory() {
//        String url = "r2dbcs:mysql://root:a12345@localhost:3306/auction";
//        return ConnectionFactories.get(url);
//    }
//}
