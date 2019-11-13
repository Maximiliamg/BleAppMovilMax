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
import com.example.bleappmovil.objects.Characteristic;

import java.util.ArrayList;
import java.util.List;

public class CharDisplayAdapter extends BaseAdapter {

    List<Characteristic> chars = new ArrayList<>();
    Context context;

    public CharDisplayAdapter(Context context) {
        this.context = context;
    }

    public void add(Characteristic chr) {
        this.chars.add(chr);
        notifyDataSetChanged(); // to render the list we need to notify
    }

    public void clear() {
        this.chars.clear();
        notifyDataSetChanged(); // to render the list we need to notify
    }

    @Override
    public int getCount() {
        return chars.size();
    }

    @Override
    public Object getItem(int i) {
        return chars.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    // This is the backbone of the class, it handles the creation of single ListView row (chat bubble)
    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        CharViewHolder holder = new CharViewHolder();
        LayoutInflater messageInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        Characteristic chr = chars.get(i);

        convertView = messageInflater.inflate(R.layout.char_list_item, null);
        holder.title = (TextView) convertView.findViewById(R.id.char_list_item_title);
        holder.subtitle = (TextView) convertView.findViewById(R.id.char_list_item_subtitle);
        holder.uuid = (TextView) convertView.findViewById(R.id.char_list_item_uuid);
        holder.descriptor = (TextView) convertView.findViewById(R.id.char_list_item_descriptor);
        holder.props = (TextView) convertView.findViewById(R.id.char_list_item_props);

        convertView.setTag(holder);
        holder.title.setText( chr.getTitle() );
        holder.subtitle.setText( chr.getSubtitle() );
        holder.uuid.setText( chr.getUuid() );
        holder.props.setText( chr.getProps() );
        holder.descriptor.setText( chr.getDescriptor() );

        return convertView;
    }

    protected void doToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}


class CharViewHolder {
    public TextView title;
    public TextView subtitle;
    public TextView uuid;
    public TextView descriptor;
    public TextView props;
}