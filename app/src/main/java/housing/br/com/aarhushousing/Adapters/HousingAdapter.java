package housing.br.com.aarhushousing.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

import housing.br.com.aarhushousing.Common.DownloadImageTask;
import housing.br.com.aarhushousing.Common.Util;
import housing.br.com.aarhushousing.Model.HousingModel;
import housing.br.com.aarhushousing.R;

import static android.R.attr.id;

// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
public class HousingAdapter extends RecyclerView.Adapter<HousingAdapter.HousingHolder> {


    private List<HousingModel> mHouses;
    private Context mContext;


    // Pass in the contact array into the constructor
    public HousingAdapter(Context context, List<HousingModel> contacts) {
        mHouses = contacts;
        mContext = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @Override
    public HousingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context c = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(c);

        View houseView = inflater.inflate(R.layout.rv_houses, parent, false);

        HousingHolder vHolder = new HousingHolder(houseView);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(HousingHolder holder, int position) {
        HousingModel house = mHouses.get(position);

        //TextView textView = holder.titleTextView;
        //textView.setText(house.getTitle());

    }

    @Override
    public int getItemCount() {
        return mHouses.size();
    }

    public static class HousingHolder extends RecyclerView.ViewHolder {
        View mView;

        public HousingHolder(View itemView) {
            super(itemView);
            mView = itemView;
        }

        public void setTitle(String name) {
            TextView field = (TextView) mView.findViewById(R.id.tvTitle);
            field.setText(name);
        }


        public void setImage(String imgUrl){

            if(imgUrl.length() > 0) {
                new DownloadImageTask((ImageView) mView.findViewById(R.id.ivHouses))
                        .execute(imgUrl);
            }else
            {
                ImageView iv = (ImageView) mView.findViewById(R.id.ivHouses);
                iv.setImageResource(R.drawable.no_image);
            }
        }
    }



}