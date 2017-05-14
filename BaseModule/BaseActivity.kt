//TODO add you package here

import android.app.Dialog
import android.content.Context
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity(), BaseContracts.View {

    var dialog: Dialog? = null

    override fun getActivityContext(): Context? {
        return this
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

    override fun showErrorDialog(error: String?) {
        dialog?.dismiss()
        val message = error ?: getString(R.string.default_error_message)
        dialog = ErrorDialog.showWithMessage(message, this)
    }
}
