package com.uren.expertise.contract.definition

import javax.persistence.*
import org.jetbrains.annotations.NotNull

class CityModel{

    val id: Long? = null
    var name: String? = null
    var cityCode: String? = null
    var countryTwoLetterCode: String? = null
    var countryThreeLetterCode: String? = null
    var longitude: Double? = null
    var latitude: Double? = null
}