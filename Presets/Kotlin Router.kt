#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
#parse("File Header.java")

import android.app.Activity


class ${Module_name}Router(var activity: Activity?) : ${Module_name}Contracts.Router {

    override fun unregister() {
        activity = null
    }
}
