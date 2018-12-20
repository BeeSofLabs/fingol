package app.beelabs.fingol.ui.activities

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.fingol.IConfig
import app.beelabs.fingol.R
import butterknife.ButterKnife
import kotlinx.android.synthetic.main.activity_task_detail.*

class TaskDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_detail)

        ButterKnife.bind(this)

        val title: String = intent.getStringExtra(IConfig.KEY_TITLE_DETAIL)
        setupUI(title)
    }

    private fun setupUI(title: String) {
        title_detail.setText(title)
        content_detail.setText(title)

        back_action.setOnClickListener {
            super.onBackPressed()
        }
    }
}