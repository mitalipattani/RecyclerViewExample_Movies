package com.example.ciccc_cirac.recyclerviewexample2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv_movie);
        recyclerView.setHasFixedSize(true);
        mAdapter = new MovieAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {

        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015", R.drawable.madmax);
        movieList.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015", R.drawable.inside);
        movieList.add(movie);

        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015", R.drawable.starwars);
        movieList.add(movie);

        movie = new Movie("Shaun the Sheep", "Animation", "2015", R.drawable.shaun);
        movieList.add(movie);

        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015", R.drawable.martian);
        movieList.add(movie);

        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015", R.drawable.mission);
        movieList.add(movie);

        movie = new Movie("Up", "Animation", "2009", R.drawable.up);
        movieList.add(movie);

        movie = new Movie("Star Trek", "Science Fiction", "2009", R.drawable.startrek);
        movieList.add(movie);

        movie = new Movie("The LEGO Movie", "Animation", "2014", R.drawable.lego);
        movieList.add(movie);

        movie = new Movie("Iron Man", "Action & Adventure", "2008", R.drawable.ironman);
        movieList.add(movie);

        movie = new Movie("Aliens", "Science Fiction", "1986", R.drawable.aliens);
        movieList.add(movie);

        movie = new Movie("Chicken Run", "Animation", "2000", R.drawable.chickenrun);
        movieList.add(movie);

        movie = new Movie("Back to the Future", "Science Fiction", "1985", R.drawable.back);
        movieList.add(movie);

        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981", R.drawable.raiders);
        movieList.add(movie);

        movie = new Movie("Goldfinger", "Action & Adventure", "1965", R.drawable.gold);
        movieList.add(movie);

        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014", R.drawable.guard);
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }

    public void deleteMovie(View view) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).isSelected()) {
                movieList.remove(i);
            }
        }
        mAdapter.notifyDataSetChanged();
    }

    public void selectAll(View view) {
        for (Movie m : movieList) {
            m.setSelected(true);
            mAdapter.notifyDataSetChanged();
        }
    }

    public void clearAll(View view) {
        for (Movie m : movieList) {
            m.setSelected(false);
            mAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
