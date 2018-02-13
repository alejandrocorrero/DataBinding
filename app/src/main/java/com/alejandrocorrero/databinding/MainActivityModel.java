package com.alejandrocorrero.databinding;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

//Extender de BaseObservable para que los cambhios sean observados en la actividad
public class MainActivityModel extends BaseObservable {
    public MainActivityModel(String prueba) {
        this.prueba = prueba;
    }

    //Añadir Bindeable para activar la funcion
    @Bindable
    public String getPrueba() {
        return prueba;
    }

    //Añadir notifi para ser notificadas de los cambios
    public void setPrueba(String prueba) {
        this.prueba = prueba;
        notifyPropertyChanged(com.alejandrocorrero.databinding.BR.prueba);
    }

    private String prueba;
    //Se llama al metodo cuando cambia el bindable
    @Bindable({"prueba"})
    public boolean isPruebaCambio() {

        return !(TextUtils.isEmpty(prueba));
    }
}
