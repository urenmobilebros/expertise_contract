package com.uren.expertise.contract.enums

enum class CallYouTypeEnum(val typeId: Int) {
    UNKNOWN(0),
    CALL_YOU_NEGATIVE_EXPERIENCE(1),
    CALL_YOU_DEMAND_INFO(2),
    CALL_YOU_BE_INCLUDED_SYSTEM(3),
    CALL_YOU_THANKS(4),
    CALL_YOU_OTHER(5);

    companion object {
        fun getById(typeId: Int): CallYouTypeEnum? {
            for (e in values()) {
                if (e.typeId == typeId) return e
            }
            return null
        }
    }
}