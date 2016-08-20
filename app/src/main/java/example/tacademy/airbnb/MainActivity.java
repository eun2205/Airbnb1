package example.tacademy.airbnb;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import example.tacademy.airbnb.fragment.MainFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    NavigationView naviView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab_click);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commit();
        }
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        naviView = (NavigationView) findViewById(R.id.navi_menu);
        naviView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.sample_hamburger);
    }

    AlertDialog dialog;
    private ArrayAdapter<String> mAdapter = null;

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_search: {
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
                break;
            }
            case R.id.menu_home: {

                break;
            }
            case R.id.menu_message: {

                break;
            }
            case R.id.menu_travel: {
                break;
            }
            case R.id.menu_wishlist: {
                break;
            }
            case R.id.menu_profile: {
                break;
            }
            case R.id.menu_hosting: {
                break;
            }
            case R.id.menu_setting: {
                break;
            }
            case R.id.menu_help: {
                startActivity(new Intent(MainActivity.this, HelpActivity.class));
                break;
            }
            case R.id.menu_invitate: {
                break;
            }
            case R.id.menu_feedback: {

                LayoutInflater inflater = getLayoutInflater();
                View dialoglayout = inflater.inflate(R.layout.dialog_feedback, null);
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);

                Spinner spinner = (Spinner)dialoglayout.findViewById(R.id.spinner_feedback);
                mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, (String[]) getResources().getStringArray(R.array.spinner));
                mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                builder.setTitle("에어비앤비에 피드백 보내기");
                builder.setMessage("에어비앤비 앱에 대한 피드백을 이메일로 보내주세요.");
                builder.setPositiveButton("피드백 보내기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.gmail.com"));
                        startActivity(intent);
                    }
                });

                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        builder.setCancelable(false);
                    }
                });
                builder.setCancelable(false);

                builder.setView(dialoglayout);
                spinner.setAdapter(mAdapter);
                dialog = builder.create();
                dialog.show();

                break;
            }
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                drawer.openDrawer(GravityCompat.START);
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
