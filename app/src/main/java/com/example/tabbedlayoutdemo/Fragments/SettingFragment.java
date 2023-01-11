package com.example.tabbedlayoutdemo.Fragments;

import static com.example.tabbedlayoutdemo.MainActivity.settingList;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tabbedlayoutdemo.Adapters.ChatsAdapter;
import com.example.tabbedlayoutdemo.Adapters.SettingAdapter;
import com.example.tabbedlayoutdemo.R;

public class SettingFragment extends Fragment {
    SettingAdapter settingAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        ListView listView = view.findViewById(R.id.settingListView);
        settingAdapter = new SettingAdapter(getContext(),settingList);
        listView.setAdapter(settingAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), "This is sample setting", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}