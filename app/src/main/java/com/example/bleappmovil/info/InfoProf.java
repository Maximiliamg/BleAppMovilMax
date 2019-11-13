package com.example.bleappmovil.info;

public class InfoProf {

    /*

•	Permissions

    <uses-feature
        android:name="android.hardware.bluetooth_le"
        android:required="true" />

	<uses-permission android:name="android.permission.BLUETOOTH" />
    <uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATIO

•	The app must detect and present to the final user if the mobile device supports BLE or not

	public static boolean CheckIfBLEIsSupportedOrNot(Context context){
        try {
            if (!context.getPackageManager().
                    hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {
                return false;
            }
            return true;
        }catch (Exception error){

        }
        return false;
    }

•	The app must detect and present if the Bluetooth deviceAdapter is turned on/off

	public static boolean RequestBluetoothDeviceEnable(final Activity activity){
        try{
            BluetoothManager bluetoothManager=(BluetoothManager) activity.getSystemService(Context.BLUETOOTH_SERVICE);
            BluetoothAdapter bluetoothAdapter=bluetoothManager.getAdapter();
            if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
                AlertDialog.Builder builder=new AlertDialog.Builder(activity)
                        .setTitle("Bluetooth")
                        .setMessage("The bluetooth device must be enabled in order to connect the device")
                        .setIcon(R.mipmap.bt_blue)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                                activity.startActivityForResult(enableBtIntent, REQUEST_BLUETOOTH_PERMISSION_NEEDED);
                            }
                        });
                builder.show();

            }else {
                return true;
            }
        }catch (Exception error){

        }
        return false;
    }


	How to know if a characteristic can be read, written, or can notify

	public boolean isCharacteristicWriteable(BluetoothGattCharacteristic characteristic) {
        return (characteristic.getProperties() &
                (BluetoothGattCharacteristic.PROPERTY_WRITE
                | BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE)) != 0;
    }

    public boolean isCharacteristicReadable(BluetoothGattCharacteristic characteristic) {
        return ((characteristic.getProperties() & BluetoothGattCharacteristic.PROPERTY_READ) != 0);
    }

    public boolean isCharacteristicNotifiable(BluetoothGattCharacteristic characteristic) {
        return ((characteristic.getProperties() & BluetoothGattCharacteristic.PROPERTY_NOTIFY) != 0);
    }

	How to enable the characteristic notification

	private void searchAndSetAllNotifyAbleCharacteristics() {
        try {

            if(lastBluetoothGatt!=null){
                for(BluetoothGattService currentService: lastBluetoothGatt.getServices()){
                    if(currentService!=null){
                        for(BluetoothGattCharacteristic currentCharacteristic:currentService.getCharacteristics()){
                            if(currentCharacteristic!=null){
                                if(isCharacteristicNotifiable(currentCharacteristic)){
                                    lastBluetoothGatt.setCharacteristicNotification(currentCharacteristic, true);
                                    for(BluetoothGattDescriptor currentDescriptor:currentCharacteristic.getDescriptors()){
                                        if(currentDescriptor!=null){
                                            try {
                                                currentDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                                                lastBluetoothGatt.writeDescriptor(currentDescriptor);
                                            }catch (Exception internalError){
                                                for (BluetoothHelperCallerInterface current:callers
                                                ) {
                                                    current.bluetoothHelperErrorThrown(internalError);
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception error){
            for (BluetoothHelperCallerInterface current:callers
            ) {
                current.bluetoothHelperErrorThrown(error);
            }
        }

    }

	How to read a characteristic

	public boolean readCharacteristic(BluetoothGattCharacteristic characteristic){
        try{
            if(characteristic==null) return false;
            return lastBluetoothGatt.readCharacteristic(characteristic);
        }catch (Exception error){
            for (BluetoothHelperCallerInterface current:callers
            ) {
                current.bluetoothHelperErrorThrown(error);
            }
        }
        return false;
    }


	How to write a characteristic

	public boolean writeCharacteristic(BluetoothGattCharacteristic characteristic,byte[] data){
        try{
            if(characteristic==null) return false;
            characteristic.setValue(data);
            return lastBluetoothGatt.writeCharacteristic(characteristic);
        }catch (Exception error){

            for (BluetoothHelperCallerInterface current:callers
            ) {
                current.bluetoothHelperErrorThrown(error);
            }
        }
        return false;
    }


     */
}
