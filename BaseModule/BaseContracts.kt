//TODO add you package here

import android.content.Context
import android.content.Intent

interface BaseContracts {

    interface View {
        fun getActivityContext(): Context?
        fun showErrorDialog(error: String?)
    }

    interface Presenter {
        fun onCreate(intent: Intent? = null) {}
        fun onResume() {}
        fun onPause() {}
        fun onDestroy()
    }

    interface Interactor {
        fun unregister()
    }

    interface InteractorOutput //does nothing for now

    interface Router {
        fun unregister()
    }

}
