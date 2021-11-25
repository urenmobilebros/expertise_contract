package com.uren.expertise.contract.expertise

import java.math.BigDecimal
import java.util.*
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType

class ExpertiseStationUpdateRequestModel{
    var stationTypeId: Int? = null
    var description: String? = null
    var amount: BigDecimal? = null
    var discount: BigDecimal? = null
    var discountType: Int? = null
}