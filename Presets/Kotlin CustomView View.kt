#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
#parse("File Header.java")

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater


class ${Module_name}View : BaseViewGroup(), ${Module_name}Contracts.View {

    var presenter: ${Module_name}Contracts.Presenter? = ${Module_name}Presenter(this)

    //region Lifecycle

    constructor(context: Context): super(context) {
        setup(context, null)
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
        setup(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr) {
        setup(context, attrs)
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int): super(context, attrs, defStyleAttr, defStyleRes) {
        setup(context, attrs)
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int): super(context, attrs, defStyleAttr) {
        setup(context, attrs)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        if (isInEditMode) {
            return
        }
        presenter?.onCreate()
    }

    //The parent activity or fragment should call onResume, onPause and onDestroy of this view

    fun onResume() {
        presenter?.onResume()
    }

    fun onPause() {
        presenter?.onPause()
    }

    fun onDestroy() {
        presenter?.onDestroy()
        presenter = null
    }

    //endregion

    //region View

    //TODO: Implement your View methods here

    //endregion

    //region Private

    private fun setup(context: Context, attrs: AttributeSet?) {
        LayoutInflater.from(context).inflate(R.layout., this, true) //TODO: Create a layout and inflate it
    }

    //endregion
}
