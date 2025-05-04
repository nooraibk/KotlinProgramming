package designpatterns.delegation.preferencesdelegationexample

class MockSharedPreferences {
    private val preferences: MutableMap<String, Any> = mutableMapOf()

    fun putString(key: String, value: String) {
        preferences[key] = value
    }

    fun getString(key: String, defaultValue: String?): String? {
        return preferences[key] as? String ?: defaultValue
    }

    fun putInt(key: String, value: Int) {
        preferences[key] = value
    }

    fun getInt(key: String, defaultValue: Int): Int {
        return preferences[key] as? Int ?: defaultValue
    }

    fun putLong(key: String, value: Long) {
        preferences[key] = value
    }

    fun getLong(key: String, defaultValue: Long): Long {
        return preferences[key] as? Long ?: defaultValue
    }

    fun putFloat(key: String, value: Float) {
        preferences[key] = value
    }

    fun getFloat(key: String, defaultValue: Float): Float {
        return preferences[key] as? Float ?: defaultValue
    }

    fun putBoolean(key: String, value: Boolean) {
        preferences[key] = value
    }

    fun getBoolean(key: String, defaultValue: Boolean): Boolean {
        return preferences[key] as? Boolean ?: defaultValue
    }

    fun remove(key: String) {
        preferences.remove(key)
    }

    fun clear() {
        preferences.clear()
    }

    fun apply(){

    }
}
