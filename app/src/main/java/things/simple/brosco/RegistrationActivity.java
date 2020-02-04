package things.simple.brosco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnRegGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        createView();
    }

    private void createView(){
        btnRegGo = findViewById(R.id.btn_reg_go);
        btnRegGo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_reg_go:
                Intent intentGo = new Intent(this, CoffeeGoActivity.class);
                startActivity(intentGo);
                break;
        }
    }
}
