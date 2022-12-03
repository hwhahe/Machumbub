package com.example.machumbub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainLevelActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private CommunityFragment communityFragment;
    private MemoFragment memoFragment;
    private LevlelSolveFragment levlelSolveFragment;
    private ResolveFragment resolveFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_level);

        bottomNavigationView = findViewById(R.id.btm_navi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.memo:
                        setFrag(0);
                        break;
                    case R.id.levelsolve:
                        setFrag(1);
                        break;
                    case R.id.resolve:
                        setFrag(2);
                        break;
                    case R.id.community:
                        setFrag(3);
                        break;
                }

                return true;
            }
        });

        memoFragment = new MemoFragment();
        levlelSolveFragment = new LevlelSolveFragment();
        resolveFragment = new ResolveFragment();
        communityFragment = new CommunityFragment();
        setFrag(1);
    }

    //프래그먼트 교체 실행문
    private void setFrag(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n){
            case 0:
                ft.replace(R.id.main_frame, memoFragment);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, levlelSolveFragment);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, resolveFragment);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame, communityFragment);
                ft.commit();
                break;
        }
    }
}