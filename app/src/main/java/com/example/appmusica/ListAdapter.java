package com.example.appmusica;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount(){
        return mData.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.activity_list_element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListElement> items){
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgCard;
        TextView name, city, status;

        ViewHolder(View itemView){
            super(itemView);
            imgCard = itemView.findViewById(R.id.imgCard);
            name = itemView.findViewById(R.id.txtName);
            city = itemView.findViewById(R.id.txtCity);
            status = itemView.findViewById(R.id.txtStatus);
        }

        void bindData(final ListElement item){
            imgCard.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            city.setText(item.getCity());
            status.setText(item.getStatus());
        }
    }
}
