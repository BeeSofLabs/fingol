package app.beelabs.fingol.ui.activities

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.fingol.R
import butterknife.ButterKnife

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)

    }
}
