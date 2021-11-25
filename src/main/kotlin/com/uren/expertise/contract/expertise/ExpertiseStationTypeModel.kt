package com.uren.expertise.contract.expertise

import java.util.*
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType

class ExpertiseStationTypeModel{
    var name: String? = null
    var createDate: Date? = null
    var updateDate: Date? = null
    var userCreated: Int? = null
    var userUpdated: Int? = null
    var active: Boolean? = null
}