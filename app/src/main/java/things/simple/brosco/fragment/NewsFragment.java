package things.simple.brosco.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import things.simple.brosco.R;
import things.simple.brosco.adapter.BestCoffee_RVA;
import things.simple.brosco.adapter.BestDeal_RVA;

public class NewsFragment extends Fragment {

    public NewsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        ArrayList<Integer> best_deals = new ArrayList<>();
        best_deals.add(R.drawable.best_deal_1);
        best_deals.add(R.drawable.best_deal_2);
        best_deals.add(R.drawable.best_deal_3);
        best_deals.add(R.drawable.best_deal_1);
        best_deals.add(R.drawable.best_deal_2);
        best_deals.add(R.drawable.best_deal_3);
        best_deals.add(R.drawable.best_deal_1);
        best_deals.add(R.drawable.best_deal_2);


        RecyclerView rv = view.findViewById(R.id.rv_best_offers);
        BestDeal_RVA adapter = new BestDeal_RVA(best_deals, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        rv.setAdapter(adapter);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); // необязательно
        rv.setLayoutManager(linearLayoutManager);



        ArrayList<Integer> best_coffees = new ArrayList<>();
        best_coffees.add(R.drawable.best_coffee);
        best_coffees.add(R.drawable.best_coffee);
        best_coffees.add(R.drawable.best_coffee);
        best_coffees.add(R.drawable.best_coffee);
        best_coffees.add(R.drawable.best_coffee);
        best_coffees.add(R.drawable.best_coffee);


        RecyclerView rv_coffee = view.findViewById(R.id.rv_best_coffee);
        BestCoffee_RVA adapter_coffee = new BestCoffee_RVA(best_coffees, getContext());
        LinearLayoutManager linearLayoutManager_2 = new LinearLayoutManager(getContext());

        rv_coffee.setAdapter(adapter_coffee);
        linearLayoutManager_2.setOrientation(LinearLayoutManager.VERTICAL); // необязательно
        rv_coffee.setLayoutManager(linearLayoutManager_2);


        return view;
    }
}
