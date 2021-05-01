package org.shalim.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulEdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEdgeApplication.class, args);
	}

}
