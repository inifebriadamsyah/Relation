package com.example.relation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchHistoryAdapter extends RecyclerView.Adapter<SearchHistoryAdapter.SearchHistoryViewHolder> {


    private ArrayList<SearchHistory> searchDataList;

    public SearchHistoryAdapter(ArrayList<SearchHistory> searchDataList) {
        this.searchDataList = searchDataList;
    }

    @NonNull
    @Override
    public SearchHistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.search_history, parent, false);
        return new SearchHistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchHistoryViewHolder holder, int position) {
        holder.tv_searchHistory.setText(searchDataList.get(position).getSearchHistory());
    }

    @Override
    public int getItemCount() {
        return (searchDataList != null) ? searchDataList.size() : 0;
    }

    public class SearchHistoryViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_searchHistory;

        public SearchHistoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_searchHistory = (TextView) itemView.findViewById(R.id.searchHistory);
        }
    }

}
