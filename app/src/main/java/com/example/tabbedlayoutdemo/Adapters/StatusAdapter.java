package com.example.tabbedlayoutdemo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tabbedlayoutdemo.Models.ChatsModel;
import com.example.tabbedlayoutdemo.Models.StatusModel;
import com.example.tabbedlayoutdemo.R;

import java.util.ArrayList;

public class StatusAdapter extends BaseAdapter {
    Context context;
    ArrayList<StatusModel> list;

    public StatusAdapter(Context context, ArrayList<StatusModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.status_sample_layout,viewGroup, false);
        StatusModel statusModel =list.get(position);
        ImageView status_image = view.findViewById(R.id.status_image);
        TextView status_contact_name = view.findViewById(R.id.status_contact_name);
        TextView status_time = view.findViewById(R.id.status_time);
        status_image.setImageResource(statusModel.getImage());
        status_contact_name.setText(statusModel.getContact_name());
        status_time.setText(statusModel.getDate());
        return view;
    }
}
