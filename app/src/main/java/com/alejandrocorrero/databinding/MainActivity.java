package com.alejandrocorrero.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.alejandrocorrero.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private MainActivityModelSinBaseObservable mModel;
    private MainActivityPresenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Bindear la actividad añadiendo el layout en el xml
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //Creacion de modelo con datos de inicio donde se ncuentran las clases bindeadas añadir Data en xml y bindeo
        mModel = new MainActivityModelSinBaseObservable();
        //mModel = new MainActivityModel();
        //Asignar al binding el modelo
        mBinding.setVm(mModel);
        //PResentador donde se ejecutaran los onclick
        mPresenter = new MainActivityPresenter();
        mBinding.setPresenter(mPresenter);
        // mBinding.btnPrueba.setOnClickListener(v -> mBinding.lblPrueba.setText("Prueba"));


        //mBinding.btnPrueba.setOnClickListener(v -> mModel.prueba.set("prueba"));
        //mBinding.btnPrueba.setOnClickListener(v -> mModel.setPrueba("prueba"));
        //Toast.makeText(this, mModel.prueba.get(), Toast.LENGTH_SHORT).show();


    }
}

