package com.demo.myburger;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String imageURL = "NA";

        TextView productName = (TextView) findViewById(R.id.burgername);
        TextView productPrice = (TextView) findViewById(R.id.price);
        TextView productIngredients = (TextView) findViewById(R.id.ingredientslist);
        ImageView productImage = (ImageView) findViewById((R.id.firstburger));

        productName.setText(getIntent().getStringExtra("Product Name"));
        productPrice.setText(getIntent().getStringExtra("Price"));
        productIngredients.setText(getIntent().getStringExtra("Ingredients"));
        imageURL = getIntent().getStringExtra("Image");

        int imageResource = getResources().getIdentifier(imageURL, null, getPackageName());
        Drawable resource = getResources().getDrawable(imageResource);
        productImage.setImageDrawable(resource);

        back = (Button) findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent previousPage = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(previousPage);
            }
        });
    }
}