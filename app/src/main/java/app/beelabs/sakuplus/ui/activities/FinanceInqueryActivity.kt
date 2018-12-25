package app.beelabs.sakuplus.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import app.beelabs.sakuplus.R
import app.beelabs.sakuplus.ui.adapter.PayListAdapter
import kotlinx.android.synthetic.main.activity_finance_inquery.*

class FinanceInqueryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finance_inquery)

        payList.layoutManager = LinearLayoutManager(this)
        payList.hasFixedSize()
        payList.adapter = PayListAdapter(this, null)
    }
}
