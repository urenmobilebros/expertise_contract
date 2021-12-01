package com.uren.expertise.contract.enums

enum class ServicePackageTypeEnum(val typeId: Int) {
    UNKNOWN(0),
    PACKAGE_BRONZE(1),
    PACKAGE_SILVER(2),
    PACKAGE_GOLD(3),
    PACKAGE_PLATINUM(4);

    companion object {
        fun getById(typeId: Int): ServicePackageTypeEnum? {
            for (e in values()) {
                if (e.typeId == typeId) return e
            }
            return null
        }


    }
}