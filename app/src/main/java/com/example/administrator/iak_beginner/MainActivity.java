package com.example.administrator.iak_beginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getSimpleName();

    private final static String USERNAME = "username";
    private final static String PASSWORD = "password";

    private TextView tv_username;
    private TextView tv_password;
    private ImageView iv_gambar;

    private String link_picture="https://i0.wp.com/www.amazine.co/wp-content/uploads/2013/12/Kucing_1.jpg?resize=650%2C487";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: ");

        tv_username = findViewById(R.id.tv_username);
        tv_password = findViewById(R.id.tv_password);
        iv_gambar = findViewById(R.id.iv_gambar);

        Picasso.with(this)
                .load(link_picture)
                .into(iv_gambar, new Callback() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(MainActivity.this, "Alhamdulillah, berhasil", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError() {
                        Toast.makeText(MainActivity.this, "Astaghfirullah, gagal", Toast.LENGTH_SHORT).show();

                    }
                });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
