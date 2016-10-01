package housing.br.com.aarhushousing;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import housing.br.com.aarhushousing.Adapters.HousingAdapter.HousingHolder;
import housing.br.com.aarhushousing.Model.HousingModel;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mRef;

    private FirebaseRecyclerAdapter<HousingModel, HousingHolder> mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView mHouses = (RecyclerView) findViewById(R.id.rvHouses);
        mHouses.setHasFixedSize(true);
        mHouses.setLayoutManager(new GridLayoutManager(this,2));
        //mHouses.setLayoutManager(new LinearLayoutManager(this));

        mRef = FirebaseDatabase.getInstance().getReference().child("housing");


        mAdapter = new FirebaseRecyclerAdapter<HousingModel, HousingHolder>(
                                                                            HousingModel.class,
                                                                            R.layout.rv_houses,
                                                                            HousingHolder.class,
                                                                            mRef)
        {

            @Override
            public void populateViewHolder(HousingHolder HousingViewHolder, HousingModel house, int position) {
                HousingViewHolder.setTitle(house.getTitle());

                if(house.getImages() != null) {
                    HousingViewHolder.setImage(house.getImages().split(";")[0]);
                }

            }
        };
        mHouses.setAdapter(mAdapter);
    }

}




