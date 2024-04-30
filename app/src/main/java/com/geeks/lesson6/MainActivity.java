package com.geeks.lesson6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView = findViewById(R.id.card_view);

        findViewById(R.id.buttonOne).setOnClickListener(view -> {

            if (cardView.getAlpha() == 0){
                cardView.animate().alpha(1);
            }else {
                cardView.animate().alpha(0);
            }
        });

        LinearLayout container = findViewById(R.id.container);



        findViewById(R.id.big_button).setOnClickListener(view -> {
            if (container.getVisibility() == View.VISIBLE){
                container.setVisibility(View.GONE);
            }else {
                container.setVisibility(View.VISIBLE);
            }
        });

        EditText editText = findViewById(R.id.edit_text);

        findViewById(R.id.btn_circle).setOnClickListener(view -> {
//            Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();

            View parentLayout = findViewById(android.R.id.content);
            Snackbar.make(parentLayout, "This is main activity", Snackbar.LENGTH_LONG)
                    .setAction("CLOSE", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    })
                    .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                    .show();
        });
    }

}