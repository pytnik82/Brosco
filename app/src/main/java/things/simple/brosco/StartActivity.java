package things.simple.brosco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;
    private TextView tvLoginWithoutRegistering, tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

        createView();
    }

    private void createView() {
        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
        tvLoginWithoutRegistering = findViewById(R.id.tv_login_without_registering);
        tvLoginWithoutRegistering.setOnClickListener(this);
        tvRegister = findViewById(R.id.tv_to_register);
        tvRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
            case R.id.tv_login_without_registering:
                Intent intentGo = new Intent(this, CoffeeGoActivity.class);
                startActivity(intentGo);
                break;
            case R.id.tv_to_register:
                Intent intentRegistering = new Intent(this, RegistrationActivity.class);
                startActivity(intentRegistering);
                break;
        }
    }
}
