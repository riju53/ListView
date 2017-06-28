package com.example.rijunath.listview_sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView lv;
    int image[]={R.mipmap.facebook,R.mipmap.gmail,R.mipmap.google1,R.mipmap.yahoo};
    String link[]={"http://www.facebook.com","http://www.gmail.com","http://www.google.com","http://www.yahoo.in"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(GridView)findViewById(R.id.lv);
        lv.setAdapter(new Myadp());
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i =new Intent(MainActivity.this,Next.class);
                i.putExtra("imag",image[position]);
                i.putExtra("lnk",link[position]);
                startActivity(i);
            }
        });
    }
    public class Myadp extends BaseAdapter{

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inf=getLayoutInflater();
            View v=inf.inflate(R.layout.second, parent, false);
            ImageView im=(ImageView)v.findViewById(R.id.im);
            TextView tv=(TextView)v.findViewById(R.id.tv);
            im.setBackgroundResource(image[position]);
            tv.setText(link[position]);
            return v;
        }
    }
}
