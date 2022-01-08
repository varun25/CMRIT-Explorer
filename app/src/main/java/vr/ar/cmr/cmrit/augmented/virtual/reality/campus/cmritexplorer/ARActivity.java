package vr.ar.cmr.cmrit.augmented.virtual.reality.campus.cmritexplorer;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.LinearLayout;


public class ARActivity extends FragmentActivity {

    private static final int MY_REQUEST_CODE =200;
    com.beyondar.android.fragment.BeyondarFragmentSupport mBeyondarFragment;
    com.beyondar.android.world.World world;
    ProgressDialog pdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_ar);

//        pdialog = new ProgressDialog(this);
//        pdialog.setMessage("Finding your location. Please wait!");
//        pdialog.show();
//        pdialog.setCancelable(false);

        mBeyondarFragment = (com.beyondar.android.fragment.BeyondarFragmentSupport) getSupportFragmentManager().findFragmentById(R.id.beyondarFragment);
        //mBeyondarFragment.setPullCloserDistance(20);
        mBeyondarFragment.setPushAwayDistance(10);
        mBeyondarFragment.setMaxDistanceToRender(1000);
        mBeyondarFragment.setDistanceFactor(10);

        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        world = new com.beyondar.android.world.World(this);

        world.setDefaultImage(R.drawable.main);

        com.beyondar.android.world.GeoObject go1 = new com.beyondar.android.world.GeoObject();
        go1.setGeoPosition(12.966717019444445, 77.7115859, 4);
        go1.setImageResource(R.drawable.main);
        world.addBeyondarObject(go1);

        com.beyondar.android.world.GeoObject go2 = new com.beyondar.android.world.GeoObject();
        go2.setGeoPosition(12.966289738888888, 77.71199621111111);
        go2.setImageResource(R.drawable.quad);
        world.addBeyondarObject(go2);

        com.beyondar.android.world.GeoObject go3 = new com.beyondar.android.world.GeoObject();
        go3.setGeoPosition(12.966289738888888, 77.71199621111111, 12);
        go3.setImageResource(R.drawable.dwni);
        world.addBeyondarObject(go3);

        com.beyondar.android.world.GeoObject go4 = new com.beyondar.android.world.GeoObject();
        go4.setGeoPosition(12.966717019444445, 77.7115859, 12);
        go4.setImageResource(R.drawable.cantn);
        world.addBeyondarObject(go4);

        com.beyondar.android.world.GeoObject go5 = new com.beyondar.android.world.GeoObject();
        go5.setGeoPosition(12.96651255, 77.71092863055556, 10);
        go5.setImageResource(R.drawable.mech);
        world.addBeyondarObject(go5);

        com.beyondar.android.world.GeoObject go6 = new com.beyondar.android.world.GeoObject();
        go6.setGeoPosition(12.966963580555555, 77.71145870000001);
        go6.setImageResource(R.drawable.bb_cort);
        world.addBeyondarObject(go6);

        com.beyondar.android.world.GeoObject go7 = new com.beyondar.android.world.GeoObject();
        go7.setGeoPosition(12.966289738888888, 77.71175446111111, -5);
        go7.setImageResource(R.drawable.complab);
        world.addBeyondarObject(go7);

        com.beyondar.android.world.GeoObject go8 = new com.beyondar.android.world.GeoObject();
        go8.setGeoPosition(12.96651255, 77.71092863055556, 25);
        go8.setImageResource(R.drawable.cvl);
        world.addBeyondarObject(go8);



        ///////
        com.beyondar.android.world.GeoObject go9 = new com.beyondar.android.world.GeoObject();
        go9.setGeoPosition(12.966077016666667, 77.71207326111112, 3);
        go9.setImageResource(R.drawable.adm_off);
        world.addBeyondarObject(go9);

        com.beyondar.android.world.GeoObject go10 = new com.beyondar.android.world.GeoObject();
        go10.setGeoPosition(12.965848630555556, 77.71150373055556);
        go10.setImageResource(R.drawable.acc_off);
        world.addBeyondarObject(go10);

        com.beyondar.android.world.GeoObject go11 = new com.beyondar.android.world.GeoObject();
        go11.setGeoPosition(12.966433280555554, 77.71131675000001, 25);
        go11.setImageResource(R.drawable.cs);
        world.addBeyondarObject(go11);

        com.beyondar.android.world.GeoObject go12 = new com.beyondar.android.world.GeoObject();
        go12.setGeoPosition(12.965852469444444, 77.71150768055556);
        go12.setImageResource(R.drawable.dean_off);
        world.addBeyondarObject(go12);

        com.beyondar.android.world.GeoObject go13 = new com.beyondar.android.world.GeoObject();
        go13.setGeoPosition(12.966433280555554, 77.71131675000001, 15);
        go13.setImageResource(R.drawable.ec);
        world.addBeyondarObject(go13);

        com.beyondar.android.world.GeoObject go14 = new com.beyondar.android.world.GeoObject();
        go14.setGeoPosition(12.966433280555554, 77.71131675000001, 5);
        go14.setImageResource(R.drawable.ee);
        world.addBeyondarObject(go14);

        com.beyondar.android.world.GeoObject go15 = new com.beyondar.android.world.GeoObject();
        go15.setGeoPosition(12.965844788888889, 77.71155673055556, 10);
        go15.setImageResource(R.drawable.exmcenter);
        world.addBeyondarObject(go15);

        com.beyondar.android.world.GeoObject go16 = new com.beyondar.android.world.GeoObject();
        go16.setGeoPosition(12.966289738888888, 77.71175446111111, -10);
        go16.setImageResource(R.drawable.gym1);
        world.addBeyondarObject(go16);






        com.beyondar.android.world.GeoObject go17 = new com.beyondar.android.world.GeoObject();
        go17.setGeoPosition(12.966717019444445, 77.7115859, 7);
        go17.setImageResource(R.drawable.gym2);
        world.addBeyondarObject(go17);

        com.beyondar.android.world.GeoObject go18 = new com.beyondar.android.world.GeoObject();
        go18.setGeoPosition(12.966717019444445, 77.7115859, 12);
        go18.setImageResource(R.drawable.health);
        world.addBeyondarObject(go18);

        com.beyondar.android.world.GeoObject go19 = new com.beyondar.android.world.GeoObject();
        go19.setGeoPosition(12.96695775, 77.71112321111111, 12);
        go19.setImageResource(R.drawable.hostel);
        world.addBeyondarObject(go19);

        com.beyondar.android.world.GeoObject go20 = new com.beyondar.android.world.GeoObject();
        go20.setGeoPosition(12.965997319444444, 77.71238718055555, 0);
        go20.setImageResource(R.drawable.incubation);
        world.addBeyondarObject(go20);

        com.beyondar.android.world.GeoObject go21 = new com.beyondar.android.world.GeoObject();
        go21.setGeoPosition(12.966433280555554, 77.71131675000001, 10);
        go21.setImageResource(R.drawable.is);
        world.addBeyondarObject(go21);

        com.beyondar.android.world.GeoObject go22 = new com.beyondar.android.world.GeoObject();
        go22.setGeoPosition(12.966289738888888, 77.71199621111111, 6);
        go22.setImageResource(R.drawable.lib);
        world.addBeyondarObject(go22);

        com.beyondar.android.world.GeoObject go23 = new com.beyondar.android.world.GeoObject();
        go23.setGeoPosition(12.965941430555555, 77.71175446111111, -5);
        go23.setImageResource(R.drawable.maker);
        world.addBeyondarObject(go23);

        com.beyondar.android.world.GeoObject go24 = new com.beyondar.android.world.GeoObject();
        go24.setGeoPosition(12.965941430555555, 77.71175446111111, 3);
        go24.setImageResource(R.drawable.princi);
        world.addBeyondarObject(go24);

        ///////
//        com.beyondar.android.world.GeoObject go25 = new com.beyondar.android.world.GeoObject();
//        go25.setGeoPosition(12.966717019444445, 77.7115859);
//        go25.setImageResource(R.drawable.volley);
//        world.addBeyondarObject(go25);

        com.beyondar.android.world.GeoObject go26 = new com.beyondar.android.world.GeoObject();
        go26.setGeoPosition(12.965844788888889, 77.71155673055556);
        go26.setImageResource(R.drawable.schol);
        world.addBeyondarObject(go26);

        com.beyondar.android.world.GeoObject go27 = new com.beyondar.android.world.GeoObject();
        go27.setGeoPosition(12.966433280555554, 77.71131675000001, 20);
        go27.setImageResource(R.drawable.tc);
        world.addBeyondarObject(go27);

        com.beyondar.android.world.GeoObject go28 = new com.beyondar.android.world.GeoObject();
        go28.setGeoPosition(12.965852469444444, 77.71150768055556, 5);
        go28.setImageResource(R.drawable.twentyfour);
        world.addBeyondarObject(go28);

        mBeyondarFragment.setWorld(world);

        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {

            final AlertDialog.Builder dialog = new AlertDialog.Builder(ARActivity.this);
            dialog.setTitle("Enable Location")
                    .setMessage("Your Locations Settings is set to 'Off'.\nPlease Enable Location to " +
                            "use this app")
                    .setCancelable(false)
                    .setPositiveButton("Location Settings", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                            Intent myIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                            startActivity(myIntent);
                            paramDialogInterface.dismiss();
                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                        }
                    });
            dialog.show();
        }

        LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
//                pdialog.dismiss();
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {
            }

            @Override
            public void onProviderEnabled(String s) {
            }

            @Override
            public void onProviderDisabled(String s) {
            }
        };

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2000, 1, locationListener);

        com.beyondar.android.util.location.BeyondarLocationManager.setLocationManager(locationManager);

        com.beyondar.android.util.location.BeyondarLocationManager.addWorldLocationUpdate(world);
    }


    @Override
    protected void onPause() {
        super.onPause();
        com.beyondar.android.util.location.BeyondarLocationManager.disable();
    }

    @Override
    protected void onResume() {
        super.onResume();
        com.beyondar.android.util.location.BeyondarLocationManager.enable();
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        if(pdialog!=null) {
//            pdialog.dismiss();
//            pdialog = null;
//        }
//    }


//    String currentDateTimeString;
//    FloatingActionButton lastPicButton;

    /*public void capture(View view)
    {   final MediaPlayer mp = MediaPlayer.create(this, R.raw.cameraclic);
        lastPicButton = (FloatingActionButton) findViewById(R.id.lastbutton);
        lastPicButton.show();
        Vibrator v = (Vibrator) this.getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(200);
        mBeyondarFragment.takeScreenshot(new OnScreenshotListener() {
            @Override
            public void onScreenshot(Bitmap screenshot) {

                mp.start();
                FileOutputStream out = null;
                try {
                    final File newFile = new File("/sdcard/Cultura17/AR pics");
                    if(!newFile.exists()) newFile.mkdirs();

                    currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
                    out = new FileOutputStream("/sdcard/Cultura17/AR pics/IMG_" + currentDateTimeString + ".png");
                    screenshot.compress(Bitmap.CompressFormat.PNG, 100, out); // bmp is your Bitmap instance
                    // PNG is a lossless format, the compression factor (100) is ignored
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (out != null) {
                            out.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Toast.makeText(getBaseContext(), "Pic saved in Cultura17 folder", Toast.LENGTH_LONG).show();
    }*/

//    boolean galleryon = false;
//    ImageView lastclick;

//    public void viewLast(View view)
//    {
//        lastclick = (ImageView) findViewById(R.id.lastpic);
//        lastclick.setVisibility(View.VISIBLE);
//        galleryon = true;
//        Glide.with(this).load(new File("/sdcard/Cultura/AR pics/IMG_" + currentDateTimeString + ".png")).into(lastclick);
//    }

    public void dismissTutorial(View view)
    {
        LinearLayout ii = (LinearLayout) findViewById(R.id.tuto);
        ii.setVisibility(View.GONE);
    }

//    @Override
//    public void onBackPressed() {
//        if(galleryon) {
//            lastclick.setVisibility(View.GONE);
//            galleryon=false;
//        }
//        else
//            finish();
//            //super.onBackPressed();
//    }
}
