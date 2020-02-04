package things.simple.brosco.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedTransformationBuilder;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.util.ArrayList;

import things.simple.brosco.R;

public class BestDeal_RVA extends RecyclerView.Adapter<BestDeal_RVA.MyViewHolder> {
    private ArrayList<Integer> mBestDeals;
    private Context context;


    public BestDeal_RVA(ArrayList<Integer> bestDeals, Context context) {
        this.mBestDeals = bestDeals;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_best_deal, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        int bestDeal = mBestDeals.get(position);

        Picasso.with(context)
                .load(bestDeal)
                .into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return mBestDeals.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;

        MyViewHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv_best_deal);
        }
    }
}
