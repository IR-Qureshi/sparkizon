package com.example.dellpc.sparkizon;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dell pc on 01-May-17.
 */

public class AdapterStoreList extends ArrayAdapter<ClassStore> {

    public AdapterStoreList(Context context, int resource, List<ClassStore> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.custom_store_item,parent,false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.storeName);
        TextView des = (TextView) convertView.findViewById(R.id.storeDes);
        TextView discount = (TextView) convertView.findViewById(R.id.storeDis);
        TextView distance = (TextView) convertView.findViewById(R.id.storeDistance);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.storeImage);

        ClassStore classStore = getItem(position);

        name.setText(classStore.getStoreName());
        des.setText(classStore.getStoreDes());
        discount.setText(classStore.getStoreDiscount());
        distance.setText(classStore.getDeliveryTime());
        imageView.setImageResource(classStore.getImageDrawable());

        return convertView;
    }

}
