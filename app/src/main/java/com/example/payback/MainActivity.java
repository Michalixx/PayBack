package com.example.payback;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int PICK_IMAGE = 100;
    Uri imageUri;



    public static final String  EXTRA_PERSON = "value";
    public static final String EXTRA_WHAT = "what"; // 0 - add 1 - sub

    ImageView[] imageViewArray = new ImageView[10];
    TextView[] nameArray = new TextView[10];
    TextView[] moneyArray = new TextView[10];
    Button[] subButtonArray = new Button[10];
    Button[] addButtonArray = new Button[10];


    public static ArrayList<Person> data = new ArrayList<>();

    public int tmpVal = -1;

    public static boolean firstTime = true;


    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(data);
        editor.putString("data", json);
        editor.apply();
    }

    public void loadSavedData(){
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("data", null);
        Type type = new TypeToken<ArrayList<Person>>() {}.getType();
        data = gson.fromJson(json, type);

        if (data == null) {
            data = new ArrayList<Person>();
        }

    }


    private void openGallery() {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data2){
        super.onActivityResult(requestCode, resultCode, data2);
        if (resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            imageUri = data2.getData();
            data.get(tmpVal).setImg(imageUri);
            imageViewArray[tmpVal].setImageURI(imageUri);
            saveData();
        }}




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(firstTime){
            loadSavedData();
            firstTime = false;
        }

        saveData();
        connectId();
        //loadData();
        updateView();


        imageViewArray[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 0;
                openGallery();
            }
        });

        imageViewArray[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 1;
                openGallery();
            }
        });

        imageViewArray[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 2;
                openGallery();
            }
        });

        imageViewArray[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 3;
                openGallery();
            }
        });

        imageViewArray[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 4;
                openGallery();
            }
        });

        imageViewArray[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 5;
                openGallery();
            }
        });

        imageViewArray[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 6;
                openGallery();
            }
        });

        imageViewArray[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 7;
                openGallery();
            }
        });

        imageViewArray[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 8;
                openGallery();
            }
        });

        imageViewArray[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpVal = 9;
                openGallery();
            }
        });


        //Buttons listeners
        addButtonArray[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 0);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);

            }
        });

        addButtonArray[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 1);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);
            }
        });

        addButtonArray[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 2);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);
            }
        });

        addButtonArray[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 3);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);
            }
        });

        addButtonArray[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 4);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);
            }
        });

        addButtonArray[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 5);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);
            }
        });

        addButtonArray[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 6);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);
            }
        });

        addButtonArray[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 7);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);
            }
        });

        addButtonArray[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 8);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);
            }
        });

        addButtonArray[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 0);
                intent.putExtra(EXTRA_WHAT, 0);
                startActivity(intent);
            }
        });

        subButtonArray[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 0);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });

        subButtonArray[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 1);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });

        subButtonArray[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 2);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });

        subButtonArray[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 3);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });

        subButtonArray[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 4);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });

        subButtonArray[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 5);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });

        subButtonArray[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 6);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });

        subButtonArray[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 7);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });

        subButtonArray[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 8);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });

        subButtonArray[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra(EXTRA_PERSON, 9);
                intent.putExtra(EXTRA_WHAT, 1);
                startActivity(intent);
            }
        });


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.addButton:
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                return true;
        }
        return true;
    }

    public void loadData(){
        data.add(new Person("Josh"));
        data.add(new Person("Peter"));
        data.add(new Person("Kaisa"));
//        data.add(new Person("Zed"));
//        data.add(new Person("Teemo"));
//        data.add(new Person("Nami"));
//        data.add(new Person("Jayce"));
//        data.add(new Person("Irelia"));
//        data.add(new Person("Garen"));
//        data.add(new Person("Darius"));
    }

    public void updateView(){
        for(int i = 0; i < data.size(); i++){
            imageViewArray[i].setVisibility(View.VISIBLE);
            nameArray[i].setVisibility(View.VISIBLE);
            moneyArray[i].setVisibility(View.VISIBLE);
            subButtonArray[i].setVisibility(View.VISIBLE);
            addButtonArray[i].setVisibility(View.VISIBLE);

            nameArray[i].setText(data.get(i).getName());
            moneyArray[i].setText(data.get(i).getMoney());

            if(data.get(i).isImgSet()){
                imageViewArray[i].setImageURI(data.get(i).getImg());
            }

        }
        for(int i = data.size(); i < 10; i++){
            imageViewArray[i].setVisibility(View.GONE);
            nameArray[i].setVisibility(View.GONE);
            moneyArray[i].setVisibility(View.GONE);
            subButtonArray[i].setVisibility(View.GONE);
            addButtonArray[i].setVisibility(View.GONE);
        }

    }

    public void connectId(){
        imageViewArray[0] = findViewById(R.id.iv1);
        imageViewArray[1] = findViewById(R.id.iv2);
        imageViewArray[2] = findViewById(R.id.iv3);
        imageViewArray[3] = findViewById(R.id.iv4);
        imageViewArray[4] = findViewById(R.id.iv5);
        imageViewArray[5] = findViewById(R.id.iv6);
        imageViewArray[6] = findViewById(R.id.iv7);
        imageViewArray[7] = findViewById(R.id.iv8);
        imageViewArray[8] = findViewById(R.id.iv9);
        imageViewArray[9] = findViewById(R.id.iv10);
        nameArray[0] = findViewById(R.id.name1);
        nameArray[1] = findViewById(R.id.name2);
        nameArray[2] = findViewById(R.id.name3);
        nameArray[3] = findViewById(R.id.name4);
        nameArray[4] = findViewById(R.id.name5);
        nameArray[5] = findViewById(R.id.name6);
        nameArray[6] = findViewById(R.id.name7);
        nameArray[7] = findViewById(R.id.name8);
        nameArray[8] = findViewById(R.id.name9);
        nameArray[9] = findViewById(R.id.name10);
        moneyArray[0] = findViewById(R.id.money1);
        moneyArray[1] = findViewById(R.id.money2);
        moneyArray[2] = findViewById(R.id.money3);
        moneyArray[3] = findViewById(R.id.money4);
        moneyArray[4] = findViewById(R.id.money5);
        moneyArray[5] = findViewById(R.id.money6);
        moneyArray[6] = findViewById(R.id.money7);
        moneyArray[7] = findViewById(R.id.money8);
        moneyArray[8] = findViewById(R.id.money9);
        moneyArray[9] = findViewById(R.id.money10);
        subButtonArray[0] = findViewById(R.id.sub1);
        subButtonArray[1] = findViewById(R.id.sub2);
        subButtonArray[2] = findViewById(R.id.sub3);
        subButtonArray[3] = findViewById(R.id.sub4);
        subButtonArray[4] = findViewById(R.id.sub5);
        subButtonArray[5] = findViewById(R.id.sub6);
        subButtonArray[6] = findViewById(R.id.sub7);
        subButtonArray[7] = findViewById(R.id.sub8);
        subButtonArray[8] = findViewById(R.id.sub9);
        subButtonArray[9] = findViewById(R.id.sub10);
        addButtonArray[0] = findViewById(R.id.add1);
        addButtonArray[1] = findViewById(R.id.add2);
        addButtonArray[2] = findViewById(R.id.add3);
        addButtonArray[3] = findViewById(R.id.add4);
        addButtonArray[4] = findViewById(R.id.add5);
        addButtonArray[5] = findViewById(R.id.add6);
        addButtonArray[6] = findViewById(R.id.add7);
        addButtonArray[7] = findViewById(R.id.add8);
        addButtonArray[8] = findViewById(R.id.add9);
        addButtonArray[9] = findViewById(R.id.add10);
    }


}

