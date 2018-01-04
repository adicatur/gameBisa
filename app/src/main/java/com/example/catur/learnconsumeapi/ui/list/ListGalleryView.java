package com.example.catur.learnconsumeapi.ui.list;

import com.example.catur.learnconsumeapi.data.model.Car;

import java.util.List;

/**
 * Created by catur on 1/2/18.
 */

public interface ListGalleryView {

    void showCars(List<Car> carList);

    void showErrorMessage(String errorMessage);
}
