package com.kykj.demo_patient_client.ui;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.DragEvent;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.kykj.demo_patient_client.R;
import com.kykj.demo_patient_client.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PatientClientHomeActivity extends BaseActivity {

    @Bind(R.id.btn_person_center)
    Button btn_person_center;

    @Bind(R.id.drawerLayout)
    DrawerLayout drawerLayout;

    private OnClickEventListener onClickEventListener;
    private boolean menuIsHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFullScreen();
        setContentView(R.layout.activity_home_layout);
        ButterKnife.bind(this);
        initVail();
        initEventListener();
    }

    private void setFullScreen(){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void initVail(){
        onClickEventListener = new OnClickEventListener();
    }

    private void initEventListener(){
        drawerLayout.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View view, DragEvent dragEvent) {
                return false;
            }
        });
        btn_person_center.setOnClickListener(onClickEventListener);
    }

    class OnClickEventListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_person_center:
                    drawerLayout.openDrawer(GravityCompat.START);
                    menuIsHide = true;
                    break;
            }
        }
    }

    @Override
    public void onBackPressed() {
        if(!menuIsHide){
            drawerLayout.closeDrawer(Gravity.LEFT);
            menuIsHide = true;
        }
        super.onBackPressed();
    }
}
