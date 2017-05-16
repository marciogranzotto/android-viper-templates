#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
#parse("File Header.java")

import android.app.Activity
import android.content.Intent

class ${Module_name}Presenter(var view: ${Module_name}Contracts.View?): ${Module_name}Contracts.Presenter, ${Module_name}Contracts.InteractorOutput {

    var interactor: ${Module_name}Contracts.Interactor? = ${Module_name}Interactor(this)
    var router: ${Module_name}Contracts.Router? = null

    //region Lifecycle

    override fun onCreate(intent: Intent?) {
        super.onCreate(intent)

        //the view can be a activity or a fragment, that's why this getActivityContext method is needed
        val activity = view?.getActivityContext() as? Activity ?: return
        router = ${Module_name}Router(activity)

        if (intent != null) { //you can delete this if there's no need to get extras from the intent
            //TODO: Do something
        }
    }

    override fun onDestroy() {
        view = null
        interactor?.unregister()
        interactor = null
        router?.unregister()
        router = null
    }

    //endregion

    //region Presenter

    //TODO: Implement your Presenter methods here

    //endregion

    //region InteractorOutput

    //TODO: Implement your InteractorOutput methods here

    //endregion
}
