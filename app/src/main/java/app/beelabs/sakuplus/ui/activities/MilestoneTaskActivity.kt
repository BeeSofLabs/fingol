package app.beelabs.sakuplus.ui.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.View
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.sakuplus.IConfig
import app.beelabs.sakuplus.R
import app.beelabs.sakuplus.ui.adapter.MilestoneListAdapter
import kotlinx.android.synthetic.main.activity_milestone_task.*
import kotlinx.android.synthetic.main.toolbar.*

class MilestoneTaskActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milestone_task)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.drawable.add_button)


        title = "Milestone Task"

//        val mapper: ObjectMapper = ObjectMapper()
//        val person = mapper.readValue(("/mockup/task.json"), PersonResponse::class.java)

        milestoneList.layoutManager = LinearLayoutManager(this)
        milestoneList.hasFixedSize()
        milestoneList.adapter = MilestoneListAdapter(this, null)

        toolbarNewButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val intent = Intent(this@MilestoneTaskActivity, FinanceInqueryActivity::class.java)
                this@MilestoneTaskActivity.startActivity(intent)
            }
        })
    }
}
