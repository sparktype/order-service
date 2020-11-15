package io.sparkwares.cloudnative.orderservice.service

import io.sparkwares.cloudnative.orderservice.repository.Order

data class OrderDto(var id: Long?) {

    companion object {
        @JvmStatic
        fun of(order: Order): OrderDto {
            return OrderDto(order.id)
        }
    }
}