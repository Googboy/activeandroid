package com.example.activeandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.activeandroid.query.Select;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Subscriber sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initadd();
        initquery();
        initReplace();
    }

    private void initReplace() {
        List<Subscriber> list3 = new Select().from(Subscriber.class).where("age=?","12").execute();
        for (int i=0;i<list3.size();i++){
            list3.get(i).setAge(100);
            list3.get(i).save();
        }
    }

    private void initquery() {
        List<Subscriber> list1 = new Select().from(Subscriber.class).execute();
        ergodic(list1,"list1");
        List<Subscriber> list2 = new Select().from(Subscriber.class).where("age=?","12").execute();
        ergodic(list2,"list2");
    }
//遍历输出
    private void ergodic(List<Subscriber> list1, String str) {
        for (int i=0;i<list1.size();i++){
            System.out.println(str+"_"+i+":"+list1.get(i).toString());
        }
    }
//添加数据
    private void initadd() {
        for (int i=0;i<5;i++){
            sub = new Subscriber();
            sub.setName("name"+i);
            sub.setAge(i+10);
            sub.save();
        }
    }
}
