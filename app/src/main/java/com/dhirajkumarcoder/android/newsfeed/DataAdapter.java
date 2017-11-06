package com.dhirajkumarcoder.android.newsfeed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DHIRAJ KUMAR JAIN on 07-11-2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<News> newses;

    public DataAdapter(ArrayList<News> newses) {
        this.newses = newses;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_name.setText(newses.get(i).getAuthor());
        viewHolder.tv_version.setText(newses.get(i).getTitle());
        viewHolder.tv_api_level.setText(newses.get(i).getDescription());
    }

    @Override
    public int getItemCount() {
        return newses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name,tv_version,tv_api_level;
        public ViewHolder(View view) {
            super(view);

            tv_name = view.findViewById(R.id.tv_name);
            tv_version = view.findViewById(R.id.tv_version);
            tv_api_level = view.findViewById(R.id.tv_api_level);

        }
    }

}