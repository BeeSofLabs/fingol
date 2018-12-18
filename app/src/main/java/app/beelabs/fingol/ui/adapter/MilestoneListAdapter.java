package app.beelabs.fingol.ui.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.beelabs.fingol.R;
import butterknife.BindView;
import butterknife.ButterKnife;

import java.util.List;

public class MilestoneListAdapter extends RecyclerView.Adapter<MilestoneListAdapter.ViewHolder> {

    private List<Object> list;
    private Activity activity;

    public MilestoneListAdapter(Activity activity, List<Object> list) {
        this.activity = activity;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_milestone_task, null, false);


        return new ViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        switch (position) {
            case 0:
                holder.date.setText("6");
                holder.month.setText("Jan");
                holder.logo.setImageResource(R.drawable.pie_chart_transfer);
                break;

            case 1:
                holder.datetimeLayout.setVisibility(View.INVISIBLE);
                holder.logo.setImageResource(R.drawable.bpjs_transfer);
                break;

            case 2:
                holder.date.setText("2");
                holder.month.setText("Jan");
                holder.logo.setImageResource(R.drawable.water_electric_transfer);
                break;

            case 3:
                holder.date.setText("1");
                holder.month.setText("Jan");
                holder.title.setText("Top Up");
                holder.title.setTextColor(activity.getResources().getColor(R.color.color_yellow));
                holder.logo.setImageResource(R.drawable.topup_transfer);
                break;

            case 4:
                holder.date.setText("31");
                holder.month.setText("Des");
                holder.title.setText("Payment Done");
                holder.title.setTextColor(activity.getResources().getColor(R.color.color_green));
                holder.logo.setImageResource(R.drawable.water_electric_transfer);
                break;
        }

        holder.detailAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(activity, JagaCashTransferNoteActivity.class);
//                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.detail_action)
        ViewGroup detailAction;
        @BindView(R.id.datetime_layout)
        ViewGroup datetimeLayout;
        @BindView(R.id.date)
        TextView date;
        @BindView(R.id.month)
        TextView month;
        @BindView(R.id.logo)
        ImageView logo;
        @BindView(R.id.title)
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
