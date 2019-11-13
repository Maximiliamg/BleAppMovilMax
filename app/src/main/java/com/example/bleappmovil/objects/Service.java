package com.example.bleappmovil.objects;

import android.bluetooth.BluetoothGattService;

public class Service {
    private String title;
    private BluetoothGattService bluetoothGattService;

    public Service(String title, BluetoothGattService bluetoothGattService) {
        this.title = title;
        this.bluetoothGattService = bluetoothGattService;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BluetoothGattService getBluetoothGattService() {
        return bluetoothGattService;
    }

    public void setBluetoothGattService(BluetoothGattService bluetoothGattService) {
        this.bluetoothGattService = bluetoothGattService;
    }
}
