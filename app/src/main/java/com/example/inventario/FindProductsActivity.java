package com.example.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.inventario.databinding.ActivityFindProductsBinding;

public class FindProductsActivity extends AppCompatActivity {

    private ActivityFindProductsBinding findProductsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findProductsBinding = ActivityFindProductsBinding.inflate(getLayoutInflater());
        View view = findProductsBinding.getRoot();
        setContentView(view);
    }
}