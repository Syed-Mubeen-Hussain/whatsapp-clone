package com.example.tabbedlayoutdemo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tabbedlayoutdemo.Models.ChatsModel;
import com.example.tabbedlayoutdemo.R;

import java.util.ArrayList;

public class ChatsAdapter extends BaseAdapter {
    Context context;
    ArrayList<ChatsModel> list;

    public ChatsAdapter(Context context, ArrayList<ChatsModel> list) {
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
        view = LayoutInflater.from(context).inflate(R.layout.chats_sample_layout,viewGroup, false);
        ChatsModel chatsModel =list.get(position);
        ImageView chat_image = view.findViewById(R.id.chat_image);
        TextView chat_contact_name = view.findViewById(R.id.chat_contact_name);
        TextView chat_message = view.findViewById(R.id.chat_message);
        TextView chat_time = view.findViewById(R.id.chat_time);
        chat_image.setImageResource(chatsModel.getImage());
        chat_contact_name.setText(chatsModel.getContact_name());
        chat_message.setText(chatsModel.getMessage());
        chat_time.setText(chatsModel.getDate());
        return view;
    }
}
