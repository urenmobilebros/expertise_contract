package com.uren.expertise.contract.service

import com.uren.expertise.contract.enums.DiscountTypeEnum
import com.uren.expertise.contract.enums.ServiceTypeEnum
import java.math.BigDecimal
import java.util.*
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType

class ServicePackageDfnModel{
    val id: Long? = null
    var serviceType: ServiceTypeEnum? = null
    var competentId: Int? = null
    var name: String? = null
    var description: String? = null
    var createDate: Date? = null
    var updateDate: Date? = null
    var userCreated: Int? = null
    var userUpdated: Int? = null
    var active: Boolean? = null
    var amount: BigDecimal? = null
    var discount: BigDecimal? = null
    var discountType: DiscountTypeEnum? = null
    var currency: String? = null
}