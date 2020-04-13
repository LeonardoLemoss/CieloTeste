package com.testeCielo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class RestTemplateConfig {

	  @Bean
      public RestTemplate restTemplate(){

          return new RestTemplate();
      }

	  @Bean
      public UriComponentsBuilder uriComponentsBuilder(){
          return UriComponentsBuilder.newInstance();
      }
	
	
}
