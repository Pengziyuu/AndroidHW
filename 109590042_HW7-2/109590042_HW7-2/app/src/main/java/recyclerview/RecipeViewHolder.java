package recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a109590042_hw7_2.R;
import com.example.a109590042_hw7_2.RecipeView;

public class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public final TextView wordItemView;
    public final TextView subwordItemView;
    public final Context context;
    public int index;

    final RecipeAdapter mAdapter;

    public RecipeViewHolder(@NonNull View itemView, RecipeAdapter adapter, Context context) {
        super(itemView);
        itemView.setOnClickListener(this);
        wordItemView = itemView.findViewById(R.id.food_name);
        subwordItemView = itemView.findViewById(R.id.food_introduce);
        this.mAdapter = adapter;
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        RecipeView.index = index;
        Intent intent = new Intent(context, RecipeView.class);
        context.startActivity(intent);
    }
}
