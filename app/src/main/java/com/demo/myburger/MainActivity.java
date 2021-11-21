package com.demo.myburger;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static String productName = "NA";
    public static String price = "NA";
    public static String ingredientList = "NA";
    public static String imageURL = "NA";

    ImageView firstBurger;
    ImageView secondBurger;
    ImageView thirdBurger;
    ImageView fourthBurger;
    ImageView fifthBurger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBurger = (ImageView) findViewById(R.id.firstburger);
        secondBurger = (ImageView) findViewById(R.id.secondburger);
        thirdBurger = (ImageView) findViewById(R.id.thirdburger);
        fourthBurger = (ImageView) findViewById(R.id.fourthburger);
        fifthBurger = (ImageView) findViewById(R.id.fifthburger);

        firstBurger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                productName = "The Classic Bunz";
                price = "P250";
                ingredientList = "Three delicious 100% beef patties\n" +
                        "Crunchy lettuce\n" +
                        "Tomatoes, Onions, and sweet sweet pickles\n" +
                        "Completed with the cheesiest cheese\n" +
                        "Nestled nicely between good ole classic burger buns";
                imageURL = "@drawable/burgerking";


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Product Name", productName);
                intent.putExtra("Price", price);
                intent.putExtra("Ingredients", ingredientList);
                intent.putExtra("Image", imageURL);
                startActivity(intent);
            }
        });

        secondBurger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                productName = "The Devil Bunz";
                price = "P220";
                ingredientList = "Double layer of fresh lettuce\n" +
                        "Tasty onion and tomatoes and pickles\n" +
                        "The best grilled burger in town\n" +
                        "Perfected with our signature hot sauce\n" +
                        "Completed with buns darker than your ex's heart";
                imageURL = "@drawable/sec";

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Product Name", productName);
                intent.putExtra("Price", price);
                intent.putExtra("Ingredients", ingredientList);
                intent.putExtra("Image", imageURL);
                startActivity(intent);
            }
        });

        thirdBurger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                productName = "The Chicks' Bunz";
                price = "P200";
                ingredientList = "Crunchy lettuce fresh from local farmers\n" +
                        "Fresh free roam chicken\n" +
                        "Cheese from the fattest cow\n" +
                        "Sandwiched together in classic Lanz buns";
                imageURL = "@drawable/third";

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Product Name", productName);
                intent.putExtra("Price", price);
                intent.putExtra("Ingredients", ingredientList);
                intent.putExtra("Image", imageURL);
                startActivity(intent);
            }
        });

        fourthBurger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                productName = "Fish Bunz";
                price = "P240";
                ingredientList = "Fresh seaweed lettuce straight from Bikini Bottom\n" +
                        "Creamy cheese from the udder of the milk fish\n" +
                        "Fried dory fish to ruin your childhood";
                imageURL = "@drawable/fourth";

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Product Name", productName);
                intent.putExtra("Price", price);
                intent.putExtra("Ingredients", ingredientList);
                intent.putExtra("Image", imageURL);
                startActivity(intent);
            }
        });

        fifthBurger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                productName = "Three Lucky Bunz";
                price = "P350";
                ingredientList = "Three mystery signature burgers\n" +
                        "Find out what it's made of";
                imageURL = "@drawable/fifth";

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Product Name", productName);
                intent.putExtra("Price", price);
                intent.putExtra("Ingredients", ingredientList);
                intent.putExtra("Image", imageURL);
                startActivity(intent);
            }
        });
    }
}