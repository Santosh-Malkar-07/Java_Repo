package com.microservice1.feignClient;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "Microservice2")
@LoadBalancerClient(name = "Microservice2")
public interface ProxyFeign {

	@RequestMapping("/getSum/{first_num}/{second_num}")
	public int calculateSum(@PathVariable Integer first_num, @PathVariable Integer second_num);
}
