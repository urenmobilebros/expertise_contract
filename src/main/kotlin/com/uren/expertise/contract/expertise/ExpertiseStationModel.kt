package com.uren.expertise.contract.expertise

import java.math.BigDecimal
import java.util.*
import javax.persistence.*

class ExpertiseStationModel{
    var id: Long? = null
    var expertiseId: Int? = null
    var stationTypeId: Int? = null
    var description: String? = null
    var createDate: Date? = null
    var updateDate: Date? = null
    var userCreated: Int? = null
    var userUpdated: Int? = null
    var active: Boolean? = null
    var amount: BigDecimal? = null
    var discount: BigDecimal? = null
    var discountType: Int? = null
}