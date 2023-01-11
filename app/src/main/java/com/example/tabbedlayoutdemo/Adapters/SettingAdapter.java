package com.example.tabbedlayoutdemo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tabbedlayoutdemo.Models.SettingModel;
import com.example.tabbedlayoutdemo.R;

import java.util.ArrayList;

public class SettingAdapter extends BaseAdapter {
    Context context;
    ArrayList<SettingModel> list;

    public SettingAdapter(Context context, ArrayList<SettingModel> list) {
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
        view = LayoutInflater.from(context).inflate(R.layout.setting_sample_layout,viewGroup, false);
        SettingModel chatsModel =list.get(position);
        ImageView setting_image = view.findViewById(R.id.setting_image);
        TextView setting_title = view.findViewById(R.id.setting_title);
        TextView setting_description = view.findViewById(R.id.setting_description);
        setting_image.setImageResource(chatsModel.getImage());
        setting_title.setText(chatsModel.getTitle());
        setting_description.setText(chatsModel.getDescription());
        return view;
    }
}
