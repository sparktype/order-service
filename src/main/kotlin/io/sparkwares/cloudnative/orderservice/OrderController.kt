package io.sparkwares.cloudnative.orderservice

import io.sparkwares.cloudnative.orderservice.service.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController {

    @Autowired
    lateinit var service: OrderService

    @GetMapping("/orders")
    fun queryAll(): ResponseEntity<Any> {
        return ResponseEntity.ok(service.retrieveAll())
    }
}