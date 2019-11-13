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
import com.example.bleappmovil.objects.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceDisplayAdapter extends BaseAdapter {

    List<Service> services = new ArrayList<>();
    Context context;

    public ServiceDisplayAdapter(Context context) {
        this.context = context;
    }

    public void add(Service srvc) {
        this.services.add(srvc);
        notifyDataSetChanged(); // to render the list we need to notify
    }

    public void clear() {
        this.services.clear();
        notifyDataSetChanged(); // to render the list we need to notify
    }

    @Override
    public int getCount() {
        return services.size();
    }

    @Override
    public Object getItem(int i) {
        return services.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    // This is the backbone of the class, it handles the creation of single ListView row (chat bubble)
    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ServiceViewHolder holder = new ServiceViewHolder();
        LayoutInflater messageInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        Service srvc = services.get(i);

        convertView = messageInflater.inflate(R.layout.service_list_item, null);
        holder.title = (TextView) convertView.findViewById(R.id.service_list_title);

        convertView.setTag(holder);
        holder.title.setText( srvc.getTitle() );

        return convertView;
    }

    protected void doToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}


class ServiceViewHolder {
    public TextView title;
}