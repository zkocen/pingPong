package com.example.cacccc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreBoard.reset();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        final Button btn1 = (Button) findViewById(R.id.button1);
        final Button btn2 = (Button) findViewById(R.id.button2);

        final Button btnReset = (Button) findViewById(R.id.buttonReset);

        final TextView pl1Serve = (TextView) findViewById(R.id.serve1);
        final TextView pl2Serve = (TextView) findViewById(R.id.serve2);
        pl2Serve.setVisibility(View.INVISIBLE);
        pl1Serve.setVisibility(View.VISIBLE);
        btn1.setText("0");
        btn2.setText("0");

        btnReset.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ScoreBoard.reset();
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn1.setText("0");
                btn2.setText("0");
                pl2Serve.setVisibility(View.INVISIBLE);
                pl1Serve.setVisibility(View.VISIBLE);
            }
        });

        btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v1) {

                ScoreBoard.player1point();

                if (ScoreBoard.gameFinishedPl1()) {
                    btn1.setText("CONGRATULATIONS YOU WON!!!");
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                } else {
                    final String s1 = Integer.toString(ScoreBoard.pl1);
                    btn1.setText(s1);
                }

                if (ScoreBoard.player2Serves()) {
                    pl2Serve.setVisibility(View.VISIBLE);
                    pl1Serve.setVisibility(View.INVISIBLE);
                } else {
                    pl1Serve.setVisibility(View.VISIBLE);
                    pl2Serve.setVisibility(View.INVISIBLE);
                }
            }
        });

        btn2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v2) {

                ScoreBoard.player2point();

                if (ScoreBoard.gameFinishedPl2()) {
                    btn2.setText("YOU WON!!!!!!!");
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                } else {
                    final String s2 = Integer.toString(ScoreBoard.pl2);
                    btn2.setText(s2);
                }

                if (ScoreBoard.player1Serves()) {
                    pl1Serve.setVisibility(View.VISIBLE);
                    pl2Serve.setVisibility(View.INVISIBLE);
                } else {
                    pl2Serve.setVisibility(View.VISIBLE);
                    pl1Serve.setVisibility(View.INVISIBLE);
                }
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
