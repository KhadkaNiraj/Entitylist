package com.example.entitylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class EntityAdapter extends BaseAdapter {
    private Context context;
    private List<Entity> entityList;

    public EntityAdapter(Context context, List<Entity> entityList) {
        this.context = context;
        this.entityList = entityList;
    }

    @Override
    public int getCount() {
        return entityList.size();
    }

    @Override
    public Object getItem(int position) {
        return entityList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.entity_items, parent, false);
        }

        Entity entity = entityList.get(position);

        ImageView icon = convertView.findViewById(R.id.entity_icon);
        TextView name = convertView.findViewById(R.id.entity_name);


        String resourceName = "entity_" + entity.getType();
        int iconResource = context.getResources().getIdentifier(resourceName, "drawable", context.getPackageName());


        if (iconResource != 0) {
            icon.setImageResource(iconResource);
        }

        name.setText(entity.getName());

        return convertView;
    }

}