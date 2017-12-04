package com.example.bertadomingo.picday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class GridAdapter extends BaseAdapter{
    private Context context;

   public GridAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() { return Foto.ITEMS.length;  }

    @Override
    public Object getItem(int position) { return Foto.ITEMS[position];  }

    @Override
    public long getItemId(int position) {
        return getItem(position).hashCode();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_grid, viewGroup, false);
        }

        ImageView imagen = (ImageView) view.findViewById(R.id.imagen);

        final Foto item = (Foto) getItem(position);
        imagen.setImageResource(item.getIdDrawable());

        return view;
    }
}
