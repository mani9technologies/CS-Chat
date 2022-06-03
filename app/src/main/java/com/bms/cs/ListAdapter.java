package com.bms.cs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bms.cs.R;
import com.bms.cs.classes.TimeTableItem;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList<TimeTableItem> timeTableItems;

    public ListAdapter(Context context, ArrayList<TimeTableItem> timeTableItems) {
        this.context = context;
        this.timeTableItems = timeTableItems;
    }

    @Override
    public int getCount() {
        return timeTableItems.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.custom_list, parent, false);

        TextView date = convertView.findViewById(R.id.date);
        TextView time = convertView.findViewById(R.id.time);
        TextView course = convertView.findViewById(R.id.course);
        TextView venue = convertView.findViewById(R.id.venue);

        date.setText(timeTableItems.get(position).getDate());
        time.setText(timeTableItems.get(position).getTime());
        course.setText(timeTableItems.get(position).getCourse());
        venue.setText(timeTableItems.get(position).getVenue());



        return convertView;
    }
}
