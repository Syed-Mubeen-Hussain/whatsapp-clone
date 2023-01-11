package com.example.tabbedlayoutdemo.Fragments;

import static com.example.tabbedlayoutdemo.MainActivity.chatList;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tabbedlayoutdemo.Adapters.ChatsAdapter;
import com.example.tabbedlayoutdemo.Models.ChatsModel;
import com.example.tabbedlayoutdemo.R;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {
    ChatsAdapter chatsAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chats, container, false);
        ListView listView = view.findViewById(R.id.chatsListView);
        chatsAdapter = new ChatsAdapter(getContext(),chatList);
        listView.setAdapter(chatsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), "This is sample chat", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}