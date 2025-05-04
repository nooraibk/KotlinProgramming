package functions.extensions

import designpatterns.delegation.preferencesdelegationexample.MockSharedPreferences
import designpatterns.delegation.preferencesdelegationexample.PrefsUtilsAdv

//Extension for AdvanceTinyDb class in delegation package
val MockSharedPreferences.delegates : PrefsUtilsAdv get() = PrefsUtilsAdv(this)