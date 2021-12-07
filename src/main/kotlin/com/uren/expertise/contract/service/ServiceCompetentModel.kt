package com.uren.expertise.contract.service

import java.util.*

class ServiceCompetentModel{

    var id: Long? = null
    var email: String? = null
    var name: String? = null
    var surname: String? = null
    var phoneNumber: String? = null
    var createDate: Date? = Calendar.getInstance().time
    var updateDate: Date? = null
    var userId: String? = null
    var nationalityId: String? = null
    var result: Int? = ServiceCompetentResultEnum.USER_NOT_FOUND.value
}