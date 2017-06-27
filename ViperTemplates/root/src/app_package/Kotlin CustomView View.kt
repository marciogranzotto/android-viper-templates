package ${packageName}

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater


class ${name}View : BaseViewGroup, ${name}Contracts.View {

    var presenter: ${name}Contracts.Presenter? = ${name}Presenter(this)

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

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        if (isInEditMode) {
            return
        }
        presenter?.onCreate()
    }

    //The parent activity or fragment should call onResume, onPause and onDestroy of this view

    override fun onResume() {
        presenter?.onResume()
    }

    override fun onPause() {
        presenter?.onPause()
    }

    override fun onDestroy() {
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
