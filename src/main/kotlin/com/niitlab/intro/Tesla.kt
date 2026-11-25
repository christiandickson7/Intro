package com.niitlab.intro


class Tesla : vehicle() {

    override fun startEngine(){
        println("starting Tesla...")
    }

    override fun fuelUp(){
        println("fueling Tesla...")
    }

    override fun stopEngine(){
        println("stopping Tesla...")
    }
}