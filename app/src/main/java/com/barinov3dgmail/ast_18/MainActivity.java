package com.barinov3dgmail.ast_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int[] movie_poster_resourse = {R.mipmap.p1,R.mipmap.p2,R.mipmap.p3,R.mipmap.p4,R.mipmap.p5};
    String[] movie_titles;
    String[] movie_ratings;
    MovieAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);
        movie_ratings = getResources().getStringArray(R.array.movie_ratings);
        movie_titles = getResources().getStringArray(R.array.movie_titles);
        int i=0;
        adapter = new MovieAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        for (String titles: movie_titles){
            MovieDataProvider dataProvider = new MovieDataProvider(movie_poster_resourse[i],titles, movie_ratings[i]);
            adapter.add(dataProvider);
            i++;
        }
    }
}
