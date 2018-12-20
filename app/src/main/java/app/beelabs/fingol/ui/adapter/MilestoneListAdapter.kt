package app.beelabs.fingol.ui.adapter

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import app.beelabs.fingol.IConfig
import app.beelabs.fingol.R
import app.beelabs.fingol.ui.activities.TaskDetailActivity
import kotlinx.android.synthetic.main.row_milestone_task.view.*

class MilestoneListAdapter(val activity: Activity, val list: List<Any>?) :
    RecyclerView.Adapter<MilestoneListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MilestoneListAdapter.ViewHolder {
        val layout: View = LayoutInflater.from(activity).inflate(R.layout.row_milestone_task, null, false)

        return ViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: MilestoneListAdapter.ViewHolder, pos: Int) {
        when (pos) {
            0 -> {
                holder.topVertical.visibility = View.INVISIBLE
                holder.date.setText("6");
                holder.month.setText("Jan");
                holder.logo.setImageResource(R.drawable.pie_chart_transfer);
            }

            1 -> {
                holder.datetimeLayout.visibility = View.INVISIBLE
                holder.logo.setImageResource(R.drawable.bpjs_transfer)
            }

            2 -> {
                holder.date.text = "2"
                holder.month.text = "Jan"
                holder.logo.setImageResource(R.drawable.water_electric_transfer)
            }

            3 -> {
                holder.logo.setImageResource(R.drawable.water_electric_transfer)
                holder.date.text = "1"
                holder.month.text = "Jan"
                holder.title.text = "Top Up"
                holder.title.setTextColor(activity.resources.getColor(R.color.color_green))
            }

            4 -> {
                holder.bottomVertical.visibility = View.INVISIBLE
                holder.logo.setImageResource(R.drawable.topup_transfer)
                holder.date.text = "31"
                holder.month.text = "Des"
                holder.title.text = "Payment Done"
                holder.title.setTextColor(activity.resources.getColor(R.color.color_green))
            }

        }

        holder.actionDetail.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val intent = Intent(activity, TaskDetailActivity::class.java)
                intent.putExtra(IConfig.KEY_TITLE_DETAIL, holder.title.text)
                activity.startActivity(intent)
            }
        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val topVertical = view.verticalLineTop
        val bottomVertical = view.verticalLineBottom

        val datetimeLayout = view.datetime_layout
        val date = view.date
        val month = view.month
        val logo = view.logo

        val title = view.title
        val content = view.content
        val time = view.time

        val actionDetail = view.detail_action
    }


}