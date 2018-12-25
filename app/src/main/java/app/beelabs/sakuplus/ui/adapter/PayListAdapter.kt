package app.beelabs.sakuplus.ui.adapter

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.beelabs.sakuplus.R

class PayListAdapter(val activity : Activity, val list: List<Any>?): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val layout: View = LayoutInflater.from(activity).inflate(R.layout.row_pay_item, parent, false)

        return ViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return 25
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, pos: Int) {

    }

    class ViewHolder(val view : View): RecyclerView.ViewHolder(view) {

    }
}