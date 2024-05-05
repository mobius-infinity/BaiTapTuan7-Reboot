package com.example.baitaptuan7_reboot;

import android.os.Bundle;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.baitaptuan7_reboot.databinding.ActivityHomeBinding;
import java.util.ArrayList;
import java.util.List;
public class HomeActivity extends AppCompatActivity {
    public ObservableField<String> title = new ObservableField<>();
    private ListUserAdapter listUserAdapter;
    public ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        title.set("ví dụ về Databinding cho RecycleView");
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home);
        //Toast.makeText(HomeActivity.this,title.toString(),Toast.LENGTH_LONG).show();
        binding.setHome(this);
        setData();
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(listUserAdapter);
        listUserAdapter.setOnItemClickListener(user -> Toast.makeText(HomeActivity.this, "bạn vừa click", Toast.LENGTH_SHORT).show());
    }
    private void setData()
    {
        List<User> userList =new ArrayList<>();
        for(int i = 0;i<3;i++)
        {
            User user = new User();
            user.setFirstName("Hoang "+i);
            user.setLastName("Tung "+ i);
            userList.add(user);
        }
        listUserAdapter = new ListUserAdapter(userList);
    }

}
