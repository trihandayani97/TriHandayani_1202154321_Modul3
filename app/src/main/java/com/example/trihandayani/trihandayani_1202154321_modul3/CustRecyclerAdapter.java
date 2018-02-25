package com.example.trihandayani.trihandayani_1202154321_modul3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tri Handayani on 2/25/2018.
 */

//create Recycler View Adapter to binds the data to the view
public class CustRecyclerAdapter extends RecyclerView.Adapter<CustRecyclerAdapter.CustRecyclerViewHolder> {

    private Context context;  //to inflate the layout
    private List<Items> itemList;

    public CustRecyclerAdapter(Context context, List<Items> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public CustRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //will create vieHolder instance
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom_item_cardview, null);
        CustRecyclerViewHolder holder = new CustRecyclerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CustRecyclerViewHolder holder, int position) { //bind data to the viewHolder

        Items item = itemList.get(position);

        holder.item_name.setText(item.getItem_name());
        holder.item_desc.setText(item.getItem_desc());
        holder.imgThumb.setImageResource(item.getImgThumb());

    }

    @Override
    public int getItemCount() { //returns the size of the lists
        return itemList.size();
    }

    //create viewHolder class to hold the view
    class CustRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView item_name, item_desc;
        ImageView imgThumb;

        public CustRecyclerViewHolder(View itemView) {
            super(itemView);

            item_name = itemView.findViewById(R.id.textView_title_item);
            item_desc = itemView.findViewById(R.id.textView_item_desc);
            imgThumb = itemView.findViewById(R.id.img_thumb);
        }
    }
}
