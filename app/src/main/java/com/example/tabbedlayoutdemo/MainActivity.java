package com.example.tabbedlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;

import com.example.tabbedlayoutdemo.Adapters.FragmentAdapter;
import com.example.tabbedlayoutdemo.Models.ChatsModel;
import com.example.tabbedlayoutdemo.Models.SettingModel;
import com.example.tabbedlayoutdemo.Models.StatusModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;
    FragmentAdapter adapter;
    Toolbar toolbar;
    public static ArrayList<ChatsModel> chatList = new ArrayList<>();
    public static ArrayList<StatusModel> statusList = new ArrayList<>();
    public static ArrayList<SettingModel> settingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // mapping the views
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        toolbar = findViewById(R.id.toolbar);
        // set the toolbar
        setSupportActionBar(toolbar);
        // tab set title and set adapter
        tabLayout.addTab(tabLayout.newTab().setText("Chats"));
        tabLayout.addTab(tabLayout.newTab().setText("Status"));
        tabLayout.addTab(tabLayout.newTab().setText("Settings"));
        adapter = new FragmentAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager.setAdapter(adapter);
        // tab click listener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
        // add the item in chats listview
        chatList.add(new ChatsModel(R.drawable.man1,"Martin Randolph","✔ Yes, 2pm is awesome","09:49 PM"));
        chatList.add(new ChatsModel(R.drawable.man2,"Andrew Parker","✔ What Kind of strategy is better?","07:02 PM"));
        chatList.add(new ChatsModel(R.drawable.woman1,"Karen Castillo","🔉 0:14","05:15 PM"));
        chatList.add(new ChatsModel(R.drawable.man3,"Maximillian Jacobson","✔ Bro, I have a good idea!","02:12 PM"));
        chatList.add(new ChatsModel(R.drawable.woman2,"Tabitha Potter","Actually I wanted to check with you...","12:45 PM"));
        chatList.add(new ChatsModel(R.drawable.women3,"Maisy Humphrey","✔ Welcome, to make design process...","7:49 PM"));
        chatList.add(new ChatsModel(R.drawable.man4,"Kieron Dotson","✔ Ok, have a good trip!","9:59 PM"));
        chatList.add(new ChatsModel(R.drawable.man5,"Chuck Pulver","🙂 Yay, this course is amazing !!! 👍","04:01 Pm"));
        chatList.add(new ChatsModel(R.drawable.man4,"Yolanda Karlin","Sixty-four doesn;t like paying taxes","03:15 PM"));
        chatList.add(new ChatsModel(R.drawable.man1,"Leeanna Munoz","That stolen figurine is often one floor...","06:41 PM"));
        chatList.add(new ChatsModel(R.drawable.women4,"Yolanda Karlin","Sixty-four doesn;t like paying taxes","05:45 PM"));
        chatList.add(new ChatsModel(R.drawable.woman5,"Trish Peer","Spam sat down once more","05:38 PM"));
        chatList.add(new ChatsModel(R.drawable.group,"Weekend Group","Go to picnic","10:38 PM"));
        // add the item in status listview
        statusList.add(new StatusModel(R.drawable.status1, "Martin Randolph","09:45 PM"));
        statusList.add(new StatusModel(R.drawable.status2, "Andrew Parker","07:12 PM"));
        statusList.add(new StatusModel(R.drawable.status3, "Karen Castillo","05:16 PM"));
        statusList.add(new StatusModel(R.drawable.status4, "Maximillian Jacobson","02:18 PM"));
        statusList.add(new StatusModel(R.drawable.status5, "Tabitha Potter","12:56 PM"));
        // add the item in setting listview
        settingList.add(new SettingModel(R.drawable.ic_wifi,"Network & Internet","Wi-Fi, mobile, data usage, hotspot"));
        settingList.add(new SettingModel(R.drawable.ic_device,"Connected devices","Bluetooth, Cast"));
        settingList.add(new SettingModel(R.drawable.ic_app,"App & notifications","Permission, default apps"));
        settingList.add(new SettingModel(R.drawable.ic_battery,"Battery","72% - about 9 hrs left"));
        settingList.add(new SettingModel(R.drawable.ic_display,"Display","Walpaper, sleep, font size"));
        settingList.add(new SettingModel(R.drawable.ic_sound,"Sound","Volume, vibration, Do not Disturb"));
        settingList.add(new SettingModel(R.drawable.ic_storage,"Storage","84% used - 2.59 GB free"));
        settingList.add(new SettingModel(R.drawable.ic_lock,"Security & Location","Screen lock"));
        settingList.add(new SettingModel(R.drawable.ic_user,"Users & accounts","Current user: Syed Mubeen Hussain"));
    }
    // create option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

}