package com.example.restaurantapp.Interface;

import android.view.View;

public interface IFoodDetailOrCartClickListener {
    void onFoodItemClickListener(View view, int position, boolean isDetail);
}