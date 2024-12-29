package designpatterns.delegation.loggingexample

/**
 * We sometimes make function in base activity class to log different activity lifecycle events
 */

//Imports will be resolved in android environment
/*

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.example.radioninternet.R
import com.example.radioninternet.core.dialog
import com.example.radioninternet.core.showLoadingDialog

interface AnalyticsLogger{
    fun registerLifecycleOwner(owner : LifecycleOwner)
}

interface Loader{
    fun openLoader(context : Context)
    fun dismissLogger()
}

class LoaderImpl : Loader {
    private var dialog: Dialog? = null

    override fun openLoader(context: Context) {
        dialog?.dismiss()
        dialog = null
        dialog = Dialog(context)
        dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.setCancelable(false)
        dialog?.setContentView(R.layout.loading_dialog)
        dialog?.show()
    }

    override fun dismissLogger() {
        dialog?.dismiss()
        dialog = null
    }
}

class AnalyticsLoggerImpl : AnalyticsLogger, LifecycleEventObserver {
    private var TAG = "LOG_EVENT::"
    override fun registerLifecycleOwner(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event){
            Lifecycle.Event.ON_STOP -> println("$TAG ON_STOP")
            Lifecycle.Event.ON_START -> println("$TAG ON_START")
            Lifecycle.Event.ON_CREATE -> println("$TAG ON_CREATE")
            Lifecycle.Event.ON_PAUSE -> println("$TAG ON_PAUSE")
            Lifecycle.Event.ON_RESUME -> println("$TAG ON_RESUME")
            Lifecycle.Event.ON_DESTROY -> println("$TAG ON_DESTROY")
            else -> {println("$TAG ELSE")}
        }
    }
}*/
