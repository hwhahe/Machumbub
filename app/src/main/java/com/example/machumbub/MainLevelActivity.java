package com.example.machumbub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.logging.Level;


public class MainLevelActivity extends AppCompatActivity {

    Button memo, levelsolve, resolve, community;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_level);

        memo = (Button) findViewById(R.id.memo);
        levelsolve = (Button) findViewById(R.id.levelsolve);
        resolve = (Button) findViewById(R.id.resolve);
        community = (Button) findViewById(R.id.community);

        memo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                MemoFragment memoFragment = new MemoFragment();
                transaction.replace(R.id.main_frame, memoFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        levelsolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                LevlelSolveFragment levlelSolveFragment = new LevlelSolveFragment();
                transaction.replace(R.id.main_frame, levlelSolveFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        resolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                ResolveFragment resolveFragment = new ResolveFragment();
                transaction.replace(R.id.main_frame, resolveFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                CommunityFragment communityFragment = new CommunityFragment();
                transaction.replace(R.id.main_frame, communityFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}