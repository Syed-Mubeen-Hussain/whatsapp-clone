package com.example.tabbedlayoutdemo.Fragments;

import static com.example.tabbedlayoutdemo.MainActivity.statusList;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tabbedlayoutdemo.Adapters.ChatsAdapter;
import com.example.tabbedlayoutdemo.Adapters.StatusAdapter;
import com.example.tabbedlayoutdemo.R;

public class StatusFragment extends Fragment {
    StatusAdapter statusAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);
        ListView listView = view.findViewById(R.id.statusListView);
        statusAdapter = new StatusAdapter(getContext(),statusList);
        listView.setAdapter(statusAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), "This is sample status", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}