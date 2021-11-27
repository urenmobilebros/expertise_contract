package com.uren.expertise.contract.service

import com.uren.expertise.contract.enums.DiscountTypeEnum
import com.uren.expertise.contract.enums.ServiceTypeEnum
import java.math.BigDecimal
import java.util.*
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType

class ServicePackageDfnUpdateRequestModel{
    var id: Long? = null
    var name: String? = null
    var description: String? = null
    var amount: BigDecimal? = null
    var discount: BigDecimal? = null
    var discountType: DiscountTypeEnum? = null
    var currency: String? = null
}