package com.uren.expertise.contract.common

import javax.persistence.*
import org.jetbrains.annotations.NotNull

class AuthModel{
    var userId: Long? = null
    var remoteIp: String? = null
}