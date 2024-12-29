package designpatterns.delegation.preferencesdelegationexample

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class PrefsUtilsAdv(private val preferences: MockSharedPreferences) {
    fun boolean() = object : ReadWriteProperty<Any, Boolean> {
        override fun getValue(thisRef: Any, property: KProperty<*>): Boolean =
            preferences.getBoolean(property.name, false)

        override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) =
//        edit{ //uncomment it for actual preferences class
            preferences.putBoolean(property.name, value)
//        }
    }

    fun string(key : String? = null, defaultValue: String = ""): ReadWriteProperty<Any, String> =
        create(key, defaultValue, { k, d -> preferences.getString(k, d) as String }, preferences::putString)

    fun integer(key : String? = null, defaultValue: Int = 0): ReadWriteProperty<Any, Int> =
        create(key, defaultValue, preferences::getInt, preferences::putInt)

    fun long(key : String? = null, defaultValue: Long = 0L): ReadWriteProperty<Any, Long> =
        create(key, defaultValue, preferences::getLong, preferences::putLong)

    fun float(key : String? = null, defaultValue: Float = 0f): ReadWriteProperty<Any, Float> =
        create(key, defaultValue, preferences::getFloat, preferences::putFloat)

    //factory pattern
    private fun <T : Any> create(
        key: String? = null,
        default: T,
        getter: (key: String, default: T) -> T,
        setter: (key: String, value: T) -> /*SharedPreferences.Editor*/ Unit //uncomment editor class for actual preferences
    ) = object : ReadWriteProperty<Any, T> {
        private fun key(property: KProperty<*>) = key ?: property.name

        override fun getValue(thisRef: Any, property: KProperty<*>): T =
            getter(key(property), default)

        override fun setValue(thisRef: Any, property: KProperty<*>, value: T) =
            setter(key(property), value)/*.apply()*///uncomment editor class for actual preferences

    }
}