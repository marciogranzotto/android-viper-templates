//TODO add you package here

import android.content.Context
import android.content.ContextWrapper
import android.support.v4.app.Fragment


abstract class BaseFragment: Fragment(), BaseContracts.View {

    fun getBaseActivity(): BaseActivity? {
        var context = context
        while (context is ContextWrapper) {
            if (context is BaseActivity) {
                return context
            }
            context = context.baseContext
        }
        return null
    }

    override fun getActivityContext(): Context? {
        return getBaseActivity()
    }

    override fun showErrorDialog(error: String?) {
        getBaseActivity()?.showErrorDialog(error)
    }
}
