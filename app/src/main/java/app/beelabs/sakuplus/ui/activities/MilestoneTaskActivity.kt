package app.beelabs.sakuplus.ui.activities

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.sakuplus.R
import app.beelabs.sakuplus.ui.adapter.MilestoneListAdapter
import kotlinx.android.synthetic.main.activity_milestone_task.*

class MilestoneTaskActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milestone_task)

        title = "Milestone Task"

//        val mapper: ObjectMapper = ObjectMapper()
//        val person = mapper.readValue(("/mockup/task.json"), PersonResponse::class.java)

        milestoneList.layoutManager = LinearLayoutManager(this)
        milestoneList.hasFixedSize()
        milestoneList.adapter = MilestoneListAdapter(this, null)

    }
}
