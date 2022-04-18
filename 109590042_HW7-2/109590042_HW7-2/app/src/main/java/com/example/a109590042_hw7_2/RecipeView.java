package com.example.a109590042_hw7_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

public class RecipeView extends Activity {

    public static int index = 0;

    int[] images = {R.drawable.one, R.drawable.two};

    String[] words = {"豬五花肉\n" +
            "420g\n" +
            "鹽\n" +
            "0.5小匙\n" +
            "香油\n" +
            "1小匙\n" +
            "沾醬\n" +
            "醬油膏\n" +
            "2大匙\n" +
            "醬油\n" +
            "0.5大匙\n" +
            "烏醋\n" +
            "1小匙\n" +
            "白開水\n" +
            "1大匙\n" +
            "糖\n" +
            "0.5小匙\n" +
            "蒜末\n" +
            "2大匙\n" +
            "薑末\n" +
            "1小匙\n" +
            "辣椒末\n" +
            "1小匙, 1.沒有電鍋可以直接用深鍋裝水中火蒸15分鐘後關火悶30分鐘。\n" +
            "2.台灣的豬肉幾乎是沒有腥味所以直接清蒸，如果怕腥味可以加薑片及少許酒一同蒸\n" +
            "3.出鍋後立即抹少許的鹽及香油可以減少水份散失，肉能保留肉汁。\n" +
            "4.稍微放涼再切肉比較不會散，切面能更漂亮。"
            ,
            "雞腿肉\n" +
            "2隻\n" +
            "蒜頭\n" +
            "1個\n" +
            "青瓜\n" +
            "1條\n" +
            "調味\n" +
            "檸檬\n" +
            "1顆\n" +
            "橄欖油\n" +
            "2湯匙\n" +
            "鹽\n" +
            "適量\n" +
            "蜜糖\n" +
            "適量"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);

        ImageView image = findViewById(R.id.ImageView);
        TextView textView = findViewById(R.id.textView);

        image.setImageResource(images[index]);
        textView.setText(words[index]);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
