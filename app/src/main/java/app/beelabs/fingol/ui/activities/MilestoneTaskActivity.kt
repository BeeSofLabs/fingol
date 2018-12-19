package app.beelabs.fingol.ui.activities

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.fingol.R
import app.beelabs.fingol.ui.adapter.MilestoneListAdapter
import kotlinx.android.synthetic.main.activity_milestone_task.*

class MilestoneTaskActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milestone_task)

        milestoneList.layoutManager = LinearLayoutManager(this)
        milestoneList.hasFixedSize()
        milestoneList.adapter = MilestoneListAdapter(this, null)

    }
}
