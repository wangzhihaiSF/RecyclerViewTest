# RecyclerViewTest
和百分比控件类似，RecyclerView 也属于新增控件，需要添加依赖库来使用。

##步骤
1.修改activity_main.xml
  ```html
  <?xml version="1.0" encoding="utf-8"?>
  <LinearLayout
      xmlns:android="http://schemas.android.com/apk/res/android"
      android:layout_width="match_parent"
      android:layout_height="match_parent">
  
      <android.support.v7.widget.RecyclerView
          android:id="@+id/recycler_view"
          android:layout_width="match_parent"
          android:layout_height="match_parent"/>
  
  </LinearLayout>
  ```
2.添加图片资源

3.新建 Fruit 类

4 添加 fruit_item.xml

5.添加 FruitAdapter
+ 新建 ViewHolder 内部类，ViewHolder 类继承自RecyclerView.ViewHolder
```java
    static class ViewHolder extends RecyclerView.ViewHolder {
           ImageView fruitImage;
           TextView fruitName;
    
           ViewHolder(View itemView) {
               super(itemView);
               fruitImage = itemView.findViewById(R.id.fruit_image);
               fruitName = itemView.findViewById(R.id.fruit_name);
    
           }
       }
```
+ 让 FruitAdapter 继承 RecyclerView.Adapter<FruitAdapter.ViewHolder>
+ 实现 RecyclerView.Adapter 方法