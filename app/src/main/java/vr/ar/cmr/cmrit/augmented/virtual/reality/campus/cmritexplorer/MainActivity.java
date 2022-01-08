package vr.ar.cmr.cmrit.augmented.virtual.reality.campus.cmritexplorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ar(View view)
    {
        Intent i = new Intent(MainActivity.this, ARActivity.class);
        startActivity(i);
    }

    public void vr(View view)
    {
        Intent ij = new Intent(MainActivity.this, VrActivity.class);
        startActivity(ij);
    }
}
