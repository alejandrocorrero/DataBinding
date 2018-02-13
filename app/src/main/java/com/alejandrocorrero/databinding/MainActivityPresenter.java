package com.alejandrocorrero.databinding;


import android.databinding.DataBindingUtil;
import android.view.View;

import com.alejandrocorrero.databinding.databinding.ActivityMainBinding;


public class MainActivityPresenter {



    public void btnPruebaOnClick(View v){
        ActivityMainBinding binding = DataBindingUtil.findBinding(v);
        MainActivityModelSinBaseObservable viewModel = binding.getVm();
        viewModel.prueba.set("Test");
    }

    public boolean btnPruebaOnLongClick(View v) {
        ActivityMainBinding binding = DataBindingUtil.findBinding(v);
        MainActivityModelSinBaseObservable viewModel = binding.getVm();
        viewModel.prueba.set("Test2");
        return  true;
    }
}
