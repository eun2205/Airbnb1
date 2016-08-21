package example.tacademy.airbnb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_login);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab_next);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailLoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btn = (Button)findViewById(R.id.btn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailLoginActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btn = (Button)findViewById(R.id.btn_searchpw);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailLoginActivity.this, FindPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
