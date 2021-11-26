package com.uren.expertise.contract.feedback

import com.uren.expertise.contract.enums.CallYouTypeEnum
import java.util.*


class CallYouModel{

    var id: Long? = null
    var email: String? = null
    var nameSurname: String? = null
    var phoneNumber: String? = null
    var createDate: Date? = null
    var updateDate: Date? = null
    var callYouType: CallYouTypeEnum? = null
    var emailSmsPermission: Boolean? = null
    var serviceTypeId: Int? = null
    var completed: Boolean? = null
    var completedTime: Date? = null
}