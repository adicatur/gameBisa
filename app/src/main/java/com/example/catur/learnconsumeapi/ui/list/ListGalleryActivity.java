package com.example.catur.learnconsumeapi.ui.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.catur.learnconsumeapi.R;
import com.example.catur.learnconsumeapi.data.model.Car;

import java.util.List;

public class ListGalleryActivity extends AppCompatActivity implements ListGalleryView {

    private RecyclerView rvListGallery;
    private GalleryAdapter adapter;
    private ListGalleryPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_gallery);

        rvListGallery = findViewById(R.id.rv_list_gallery);
        initView();
    }

    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        adapter = new GalleryAdapter(this);
        rvListGallery.setAdapter(adapter);
        rvListGallery.setLayoutManager(linearLayoutManager);

        presenter = new ListGalleryPresenter(this);
        presenter.showAllCars();

    }

    private void refreshList() {
        presenter.showAllCars();
    }

    @Override
    public void showCars(List<Car> carList) {
        adapter.setData(carList);
    }

    @Override
    public void showErrorMessage(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }
}
