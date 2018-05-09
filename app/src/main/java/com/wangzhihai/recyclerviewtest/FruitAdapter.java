package com.wangzhihai.recyclerviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by 王治海 on 2018/5/9.
 */
public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    private List<Fruit> mFruitList;

    //把要展示的数据源传递进来
    public FruitAdapter(List<Fruit> fruitList) {
        this.mFruitList = fruitList;
    }

    //用于加载 fruit_item.xml 布局
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent,
                false);
        return new ViewHolder(view);
    }

    //用于对 RecyclerView 的子项赋值，会在每个子项滚动到屏幕上执行
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Fruit fruit = mFruitList.get(position);
        holder.fruitName.setText(fruit.getFruitName());
        holder.fruitImage.setImageResource(fruit.getFruitImage());

    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
       ImageView fruitImage;
       TextView fruitName;
       //View 是 RecyclerView 子项的最外层布局
       ViewHolder(View itemView) {
           super(itemView);
           fruitImage = itemView.findViewById(R.id.fruit_image);
           fruitName = itemView.findViewById(R.id.fruit_name);

       }
   }
}
