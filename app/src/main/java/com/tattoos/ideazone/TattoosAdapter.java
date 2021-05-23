package com.tattoos.ideazone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.tattoos.BillingActivity;
import com.tattoos.Tattoo;

import java.util.ArrayList;

public class TattoosAdapter extends RecyclerView.Adapter<TattoosAdapter.TattooViewHolder> {
    private ArrayList<Tattoo> tattoos;
    private Context context;

    public TattoosAdapter(ArrayList<Tattoo> tattoos, Context context) {
        this.tattoos = tattoos;
        this.context = context;
    }

    @Override
    public TattooViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tattoo, parent, false);
        return new TattooViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TattoosAdapter.TattooViewHolder holder, int position) {
        final Tattoo tattoo = tattoos.get(position);
        holder.title.setText(context.getString(tattoo.getDescription()));
        holder.image.setImageResource(tattoo.getImage());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BillingActivity.class);
                intent.putExtra("tattoo", tattoo);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return tattoos.size();
    }

    class TattooViewHolder extends RecyclerView.ViewHolder {
        LinearLayout layout;
        TextView title;
        ImageView image;

        public TattooViewHolder(View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.tattooLayout);
            title = itemView.findViewById(R.id.tattooText);
            image = itemView.findViewById(R.id.tattooImage);
        }
    }
}
