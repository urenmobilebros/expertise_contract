package com.uren.expertise.contract.enums

enum class ServiceTypeEnum(val typeId: Int) {
    UNKNOWN(0),
    SERVICE_CAR_WASH(1),
    SERVICE_CAR_CARE(2),
    SERVICE_CAR_REPAIR(3),
    SERVICE_CAR_EXPERTISE(4);

    companion object {
        fun getById(typeId: Int): ServiceTypeEnum? {
            for (e in values()) {
                if (e.typeId == typeId) return e
            }
            return null
        }
    }
}