package io.sparkwares.cloudnative.orderservice.service

import io.sparkwares.cloudnative.orderservice.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OrderService {

    @Autowired
    lateinit var repository: OrderRepository

    fun retrieveAll(): List<OrderDto> {
        return repository.findAll().map { OrderDto.of(it) }
    }
}