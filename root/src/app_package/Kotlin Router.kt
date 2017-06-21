package ${packageName}

import android.app.Activity

class ${name}Router(var activity: Activity?) : ${name}Contracts.Router {

    override fun unregister() {
        activity = null
    }

    //region Router

    //TODO: Implement your Router methods here

    //endregion
}
