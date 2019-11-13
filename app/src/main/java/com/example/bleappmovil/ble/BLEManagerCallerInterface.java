package com.example.bleappmovil.ble;

import android.bluetooth.BluetoothGattService;
import android.bluetooth.le.ScanResult;

import java.util.ArrayList;
import java.util.List;

public interface BLEManagerCallerInterface {

    void scanStartedSuccessfully();
    void scanStoped();
    void scanFailed(int error);
    void newDeviceDetected(ScanResult result);
    void newServiceDetected(List<BluetoothGattService> bluetoothGattServices);

}
