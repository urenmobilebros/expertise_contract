package com.uren.expertise.contract.expertise

import java.util.*
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType

class ExpertiseModel{

    var id: Long? = null
    var name: String? = null
    var phoneNumber: String? = null
    var mobilePhoneNumber: String? = null
    var email: String? = null
    var longitude: Double? = null
    var latitude: Double? = null
    var openHour: Int? = null
    var closeHour: Int? = null
    var country: String? = null
    var city: String? = null
    var district: String? = null
    var address: String? = null
    var createDate: Date? = null
    var updateDate: Date? = null
}