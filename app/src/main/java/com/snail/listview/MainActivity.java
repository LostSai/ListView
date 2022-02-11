package com.snail.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Animal> mData = null;
    private Context mContext;
    private AnimalAdapter mAdapter = null;
    private ListView list_animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        list_animal = (ListView) findViewById(R.id.list_animal);

        //要显示的数据
        String[] strs = {"基神","B神","翔神","曹神","J神"};
        //创建ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_expandable_list_item_1,strs);

        mData = new LinkedList<Animal>();
        mData.add(new Animal("狗说", "你是狗么?", R.mipmap.fu_04));
        mData.add(new Animal("牛说", "你是牛么?", R.mipmap.fu_06));
        mData.add(new Animal("鸭说", "你是鸭么?", R.mipmap.fu_09));
        mData.add(new Animal("鱼说", "你是鱼么?", R.mipmap.fu_12));
        mData.add(new Animal("马说", "你是马么?", R.mipmap.fu_14));
        mAdapter = new AnimalAdapter((LinkedList<Animal>) mData, mContext);

        //获取ListView对象，通过调用setAdapter方法为ListView设置Adapter设置适配器
        list_animal.setAdapter(mAdapter);
    }

}