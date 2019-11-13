package com.example.bleappmovil.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bleappmovil.R;
import com.example.bleappmovil.objects.Device;

import java.util.ArrayList;
import java.util.List;

public class DeviceDisplayAdapter extends BaseAdapter {

    List<Device> devices = new ArrayList<>();
    Context context;

    public DeviceDisplayAdapter(Context context) {
        this.context = context;
    }

    public void add(Device dvc) {
        this.devices.add(dvc);
        notifyDataSetChanged(); // to render the list we need to notify
    }

    public void clear() {
        this.devices.clear();
        notifyDataSetChanged(); // to render the list we need to notify
    }

    @Override
    public int getCount() {
        return devices.size();
    }

    @Override
    public Object getItem(int i) {
        return devices.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    // This is the backbone of the class, it handles the creation of single ListView row (chat bubble)
    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        DeviceViewHolder holder = new DeviceViewHolder();
        LayoutInflater messageInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        Device dvc = devices.get(i);

        convertView = messageInflater.inflate(R.layout.device_list_item, null);
        holder.name = (TextView) convertView.findViewById(R.id.device_list_item_layout_name);
        holder.mac = (TextView) convertView.findViewById(R.id.device_list_item_layout_mac);
        holder.signal = (TextView) convertView.findViewById(R.id.device_list_item_layout_signal);

        convertView.setTag(holder);
        holder.name.setText( dvc.getName() );
        holder.mac.setText( dvc.getMac() );
        holder.signal.setText( "" + dvc.getSignal() );

        return convertView;
    }

    protected void doToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}


class DeviceViewHolder {
    public TextView name;
    public TextView mac;
    public TextView signal;
}