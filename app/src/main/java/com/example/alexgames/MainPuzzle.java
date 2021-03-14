package com.example.alexgames;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static com.example.alexgames.Function.AnimImgBtn;

public class MainPuzzle extends AppCompatActivity {
    String mCurrentPhotoPath;
    private static final int REQUEST_PERMISSION_WRITE_EXTERNAL_STORAGE = 2;
    private static final int REQUEST_IMAGE_CAPTURE = 1;
    static final int REQUEST_PERMISSION_READ_EXTERNAL_STORAGE = 3;
    static final int REQUEST_IMAGE_GALLERY = 4;
    private ImageButton btn_back_puzzle_main;
    private MediaPlayer click;
    public static Integer rowsMain = 3, colsMain = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_puzzle_main);



        btn_back_puzzle_main = findViewById(R.id.btn_back_puzzle_main);
        btn_back_puzzle_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(MainPuzzle.this, R.raw.click);
                soundPlay(click);
//                Intent intent = new Intent(MainPuzzle.this, ChooseGame.class);
//                startActivity(intent);
                finish();
            }
        });
        AnimImgBtn(btn_back_puzzle_main);

        AssetManager am = getAssets();
        try {
            final String[] files  = am.list("img");

            GridView grid = findViewById(R.id.grid);
            grid.setAdapter(new ImageAdapter(this));
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(getApplicationContext(), PuzzleActivity.class);
                    intent.putExtra("assetName", files[i % files.length]);
                    startActivity(intent);
                }
            });
        } catch (IOException e) {
            Toast.makeText(this, e.getLocalizedMessage(), Toast.LENGTH_SHORT);
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    public void onImageFromCameraClick(View view) {
        FloatingActionButton cameraButton = findViewById(R.id.cameraButton);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(MainPuzzle.this, R.raw.click);
                soundPlay(click);
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    File photoFile = null;
                    try {
                        photoFile = createImageFile();
                    } catch (IOException e) {
                        Toast.makeText(MainPuzzle.this, e.getMessage(), Toast.LENGTH_LONG);
                    }

                    if (photoFile != null) {
                        Uri photoUri = FileProvider.getUriForFile(MainPuzzle.this, getApplicationContext().getPackageName() + ".fileprovider", photoFile);
                        intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri);
                        startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
                    }
                }
            }
        });
        AnimImgBtn(cameraButton);

    }

    private File createImageFile() throws IOException {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            // permission not granted, initiate request
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_PERMISSION_WRITE_EXTERNAL_STORAGE);
        } else if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, REQUEST_IMAGE_CAPTURE);
        } else{
            // Create an image file name
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String imageFileName = "JPEG_" + timeStamp + "_";
            File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            File image = File.createTempFile(
                    imageFileName,  /* prefix */
                    ".jpg",         /* suffix */
                    storageDir      /* directory */
            );
            mCurrentPhotoPath = image.getAbsolutePath(); // save this to use in the intent

            return image;
        }

        return null;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_PERMISSION_WRITE_EXTERNAL_STORAGE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    onImageFromCameraClick(new View(this));
                }

                return;
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Intent intent = new Intent(this, PuzzleActivity.class);
            intent.putExtra("mCurrentPhotoPath", mCurrentPhotoPath);
            startActivity(intent);
        }
        if (requestCode == REQUEST_IMAGE_GALLERY && resultCode == RESULT_OK) {
            Uri uri = data.getData();

            Intent intent = new Intent(this, PuzzleActivity.class);
            intent.putExtra("mCurrentPhotoUri", uri.toString());
            startActivity(intent);
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    public void onImageFromGalleryClick(View view) {
        FloatingActionButton galleryButton = findViewById(R.id.galleryButton);
        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = MediaPlayer.create(MainPuzzle.this, R.raw.click);
                soundPlay(click);
                if (ContextCompat.checkSelfPermission(MainPuzzle.this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainPuzzle.this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_PERMISSION_READ_EXTERNAL_STORAGE);
                } else {
                    Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                    intent.setType("image/*");
                    startActivityForResult(intent, REQUEST_IMAGE_GALLERY);
                }
            }
        });
        AnimImgBtn(galleryButton);

    }

    public void soundPlay(MediaPlayer sound){
        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (sound != null){
                    sound.stop();
                    sound.release();
                }
            }
        });
        sound.setVolume(0.2f, 0.2f);
        sound.start();
    }
    public void soundStop(MediaPlayer sound){
        if(sound != null){
            sound.stop();
            sound.release();
        }
    }

    public void onImageFromSettingsClick (View view){
        FloatingActionButton settingsButton = findViewById(R.id.settingButton);
        settingsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                final String[] sizePuzzle = {"3х4", "4х5", "5х6"};

                AlertDialog.Builder builder = new AlertDialog.Builder(MainPuzzle.this);
                builder.setTitle("Выберите размер пазла")
                        // добавляем переключатели
                        .setSingleChoiceItems(sizePuzzle, -1,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int item) {
                                        Toast.makeText(
                                                MainPuzzle.this,
                                                "Рабран размер: "
                                                        + sizePuzzle[item],
                                                Toast.LENGTH_SHORT).show();

                                        switch(item)
                                        {
                                            case 0:
                                                rowsMain = 3;
                                                colsMain = 4;
                                                break;
                                            case 1:
                                                rowsMain = 4;
                                                colsMain = 5;
                                                break;
                                            case 2:
                                                rowsMain = 5;
                                                colsMain = 6;
                                                break;
//So on and so forth
                                        }
                                    }
                                })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                // User clicked OK, so save the mSelectedItems results somewhere
                                // or return them to the component that opened the dialog



                            }
                        })
                        .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                builder.show();
            }
        });
    }

}
