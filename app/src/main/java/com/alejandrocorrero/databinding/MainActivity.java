package com.alejandrocorrero.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.alejandrocorrero.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private MainActivityModel mModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Bindear la actividad añadiendo el layout en el xml
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        // mBinding.btnPrueba.setOnClickListener(v -> mBinding.lblPrueba.setText("Prueba"));

        mBinding.btnPrueba.setOnClickListener(v -> mModel.setPrueba("test2"));
        mModel = new MainActivityModel("Prueba");
        mBinding.setVm(mModel);
        Toast.makeText(this, String.valueOf(mModel.isPruebaCambio()), Toast.LENGTH_SHORT).show();


    }
}

