package io.sparkwares.cloudnative.orderservice.repository

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Order(@Id
                 @GeneratedValue(strategy = GenerationType.IDENTITY)
                 var id: Long? = null,
                 var amount: BigDecimal,
                 var status: String)