package com.example.a109590042_hw7_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

import recyclerview.RecipeAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecipeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList<String> foodName = new LinkedList<>();
        LinkedList<String> foodIntroduce = new LinkedList<>();

        foodName.add("蒜泥白肉");
        foodName.add("超簡易檸檬蒜油雞");

        foodIntroduce.add("使用電鍋就能簡單快速完成經典菜品，\n" + "肉香濃郁，蒜味鮮香，香而不膩，\n" + "看似簡單，滋味卻非常豐富。");
        foodIntroduce.add("這道檸檬蒜油雞和平時中式的不同，平時的蒜油是把蒜頭滿火炸好後浸油，但這道料理的蒜頭是用橄欖油搗碎至奶油的狀態，最後加入少許蜂蜜中和蒜頭的辛辣味，擠上檸檬汁，是個獨特美味的醬汁！");

        mRecyclerView =findViewById(R.id.recycleview);
        mAdapter = new RecipeAdapter(this, foodName, foodIntroduce);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}