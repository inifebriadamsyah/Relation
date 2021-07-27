package com.example.relation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {


    private ArrayList<Event> dataList;

    public EventAdapter(ArrayList<Event> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_event_placeholder, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        holder.tv_eventName.setText(dataList.get(position).getEventName());
        holder.tv_eventHolder.setText(dataList.get(position).getEventHolder());
        holder.tv_eventTime.setText(dataList.get(position).getEventTime());
        holder.tv_eventLocation.setText(dataList.get(position).getEventLocation());
        holder.tv_eventCategory.setText(dataList.get(position).getEventCategory());
    }


    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_eventName, tv_eventHolder, tv_eventTime, tv_eventLocation, tv_eventCategory;


        public EventViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_eventName = (TextView) itemView.findViewById(R.id.eventName);
            tv_eventHolder = (TextView) itemView.findViewById(R.id.eventHolder);
            tv_eventTime = (TextView) itemView.findViewById(R.id.eventTime);
            tv_eventLocation = (TextView) itemView.findViewById(R.id.eventLocation);
            tv_eventCategory = (TextView) itemView.findViewById(R.id.eventCategory);

        }
    }
}
