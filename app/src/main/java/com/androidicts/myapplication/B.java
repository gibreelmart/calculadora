package com.androidicts.myapplication;

/**
 * Created by alumno on 29/11/2016.
 */

public class B {
    AInterfaz a;

    public B(AInterfaz a) {
        this.a = a;
    }


    public void hola() {
        System.out.print("Hola B");
        AInterfaz a = new AMejorado();
        a.hola();
    }
    public static void main(String[] args){
        B b = new B(new AMejorado());
        b.hola();
        b bfeo = new B (new A());
        bfeo.hola();
    }
}
