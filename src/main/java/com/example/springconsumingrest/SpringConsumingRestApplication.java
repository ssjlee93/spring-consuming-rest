package com.example.springconsumingrest;

import com.example.springconsumingrest.models.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringConsumingRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringConsumingRestApplication.class, args);
	}

	// uses Jackson to process incoming data
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	// runs the RestTemplate
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"https://gistcdn.githack.com/ayan-b/ff0441b5a8d6c489b58659ffb849aff4/raw/e1c5ca10f7bea57edd793c4189ea8339de534b45/response.json", Quote.class);
			log.info(quote.toString());
		};
	}
}
