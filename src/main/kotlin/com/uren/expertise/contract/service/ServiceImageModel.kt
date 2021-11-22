package com.uren.expertise.contract.service

import java.util.*
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType

class ServiceImageModel{

    var id: Long? = null
    var serviceId: Int? = null
    var url: String? = null
    var createDate: Date? = null
    var updateDate: Date? = null
}