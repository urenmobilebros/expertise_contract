package com.uren.expertise.contract.feedback

import com.uren.expertise.contract.enums.CallYouTypeEnum

class CallYouAddRequestModel{

    var email: String? = null
    var nameSurname: String? = null
    var phoneNumber: String? = null
    var callYouTypeEnum: CallYouTypeEnum? = null
    var emailSmsPermission: Boolean? = null
}