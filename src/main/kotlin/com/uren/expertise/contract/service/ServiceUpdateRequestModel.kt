package com.uren.expertise.contract.service

import java.util.*
import javax.persistence.Column
import javax.persistence.Temporal
import javax.persistence.TemporalType

class ServiceModel{

    var id: Long? = null
    var serviceId: Int? = null
    var serviceTypeId: Int? = null
    var createDate: Date? = null
    var updateDate: Date? = null
    var competentId: Int? = null
    var isMaster: Boolean? = null
    var serviceMasterId: Int? = null
    var isApproved: Boolean? = null
    var approvedDate: Date? = null
}