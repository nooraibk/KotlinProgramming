package designpatterns.delegation.preferencesdelegationexample

import kotlin.reflect.KProperty


inline operator fun <reified T> MockSharedPreferences.getValue(thisRef: Any, property: KProperty<*>): T {
    println("property param : name = ${property.name} getter = ${property.getter}")
    return when (T::class) {
        Boolean::class -> getBoolean(property.name, false)
        Int::class -> getInt(property.name, 0)
        Long::class -> getLong(property.name, 0L)
        Float::class -> getFloat(property.name, 0.0f)
        String::class -> getString(property.name, "")
        else -> throw UnsupportedOperationException()
    } as T
}

/**
 * why is "is" not required in getValue when statement
 * how is :: working in getValue when statement
 */

operator fun <T> MockSharedPreferences.setValue(thisRef: Any, property: KProperty<*>, value: T) {
//    edit { //uncomment edit for actual android preferences
        when (value) {
            is Boolean -> putBoolean(property.name, value)
            is Int -> putInt(property.name, value)
            is Long -> putLong(property.name, value)
            is Float -> putFloat(property.name, value)
            is String -> putString(property.name, value)
            else -> throw UnsupportedOperationException()
        }
//    }
}