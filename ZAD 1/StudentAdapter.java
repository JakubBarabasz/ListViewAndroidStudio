package com.example.students;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {
    private Context mContext;
    private  int mResource;

    public StudentAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Student> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource,parent,false);

        TextView txtName  = convertView.findViewById(R.id.txtName);

        TextView txtAge  = convertView.findViewById(R.id.txtAge);

        TextView txtHeight  = convertView.findViewById(R.id.txtHeight);

        TextView txtKlasa  = convertView.findViewById(R.id.txtKlasa);

        TextView txtSchool  = convertView.findViewById(R.id.txtSchool);


        txtName.setText(getItem(position).getName());

        txtAge.setText(getItem(position).getAge());

        txtHeight.setText(getItem(position).getHeight());

        txtKlasa.setText(getItem(position).getKlasa());

        txtSchool.setText(getItem(position).getSchool());


        return convertView;
    }
}
