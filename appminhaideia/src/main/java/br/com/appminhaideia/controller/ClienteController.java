package br.com.appminhaideia.controller;

import android.util.Log;

import br.com.appminhaideia.core.AppUtil;

public class ClienteController {

    private String versaoApp;

    public String getVersaoApp() {
        return versaoApp;
    }

    public void setVersaoApp(String versaoApp) {
        this.versaoApp = versaoApp;
    }

    public ClienteController(){
        versaoApp = AppUtil.versaoDoAplicativo();
        Log.i(AppUtil.TAG,"C: "+versaoApp);
    }
}
