package com.example.bleappmovil.objects;

import android.bluetooth.BluetoothDevice;

public class Device {
    private String name;
    private String mac;
    private int signal;
    private BluetoothDevice bluetoothDevice;

    public Device(String name, String mac, int signal, BluetoothDevice bluetoothDevice) {
        this.name = name;
        this.mac = mac;
        this.signal = signal;
        this.bluetoothDevice = bluetoothDevice;
    }

    public String getName() {
        return name;
    }

    public BluetoothDevice getBluetoothDevice() {
        return bluetoothDevice;
    }

    public void setBluetoothDevice(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSignal() {
        return signal;
    }

    public String getSignalString() {
        return (signal < -115)? "None" :
                (signal >= -115 && signal < -80)? "Low" :
                        (signal >= -80 && signal > -30)? "Medium" :
                                "High";
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }
}
