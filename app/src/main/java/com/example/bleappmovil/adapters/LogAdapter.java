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
import com.example.bleappmovil.activities.MainActivity;
import com.example.bleappmovil.objects.LogMessage;

import java.util.ArrayList;
import java.util.List;

public class LogAdapter  extends BaseAdapter {

    List<LogMessage> messages = new ArrayList<>();
    Context context;

    public LogAdapter(Context context) {
        this.context = context;
        this.messages = MainActivity.log;
    }

//    public void add(LogMessage msg) {
//        MainActivity.log.add(msg);
//        notifyDataSetChanged(); // to render the list we need to notify
//    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int i) {
        return messages.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    // This is the backbone of the class, it handles the creation of single ListView row (chat bubble)
    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LogHolder holder = new LogHolder();
        LayoutInflater messageInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        LogMessage msg = messages.get(i);

        convertView = messageInflater.inflate(R.layout.log_item, null);
        holder.msgtype = (TextView) convertView.findViewById(R.id.log_item_msgtype);
        holder.timestamp = (TextView) convertView.findViewById(R.id.log_item_timestamp);
        holder.body = (TextView) convertView.findViewById(R.id.log_item_msg);

        convertView.setTag(holder);
        holder.msgtype.setText(msg.getType());
        holder.timestamp.setText(msg.getTimestamp());
        holder.body.setText(msg.getBody());

        return convertView;
    }

    protected void doToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}


class LogHolder {
    public TextView body;
    public TextView msgtype;
    public TextView timestamp;
}