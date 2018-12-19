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

//        val params: ViewGroup.LayoutParams = verticalLine.layoutParams
//        val metrics: DisplayMetrics = resources.displayMetrics
//        params.height = toPixels(3f * 120f, metrics).toInt()

    }

//    private fun toPixels(dp: Float, metrics: DisplayMetrics): Float {
//        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, metrics)
//    }
}
