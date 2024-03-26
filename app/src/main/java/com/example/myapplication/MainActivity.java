package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView profilePicture;
    TextView username, bio, followersCount, followingCount, postsCount;
    Button postsTab, photosTab, videosTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        profilePicture = findViewById(R.id.profile_picture);

        followersCount = findViewById(R.id.followers_count);
        followingCount = findViewById(R.id.following_count);
        postsCount = findViewById(R.id.posts_count);


        // Set dummy data (replace with actual data from your backend or preferences)
        profilePicture.setImageResource(R.drawable.profile_pic);



    }
}
