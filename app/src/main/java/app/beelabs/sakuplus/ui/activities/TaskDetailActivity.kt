package app.beelabs.sakuplus.ui.activities

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.sakuplus.IConfig
import app.beelabs.sakuplus.R
import app.beelabs.sakuplus.ui.adapter.DetailListAdapter
import kotlinx.android.synthetic.main.activity_task_detail.*

class TaskDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_detail)

        val title: String = intent.getStringExtra(IConfig.KEY_TITLE_DETAIL)
        setupUI(title)

        back_action.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun setupUI(title: String) {
        title_detail.setText(title)
        content_detail.setText(title)

        detailList.layoutManager = LinearLayoutManager(this)
        detailList.hasFixedSize()
        detailList.adapter = DetailListAdapter(this, null)

    }
}