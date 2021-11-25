package com.uren.expertise.contract.enums

enum class DiscountTypeEnum(val typeId: Int) {
    UNKNOWN(0),
    DISCOUNT_TYPE_AMOUNT(1),
    DISCOUNT_TYPE_PERCENT(2);

    companion object {
        fun getById(typeId: Int): DiscountTypeEnum? {
            for (e in values()) {
                if (e.typeId == typeId) return e
            }
            return null
        }
    }
}