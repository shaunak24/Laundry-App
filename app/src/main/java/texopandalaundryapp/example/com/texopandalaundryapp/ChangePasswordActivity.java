package texopandalaundryapp.example.com.texopandalaundryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePasswordActivity extends AppCompatActivity {

    EditText newPassword;
    EditText reenterPassword;
    Button resetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        newPassword = (EditText) findViewById(R.id.new_password);
        reenterPassword = (EditText) findViewById(R.id.re_enter_password);

        resetPassword = (Button) findViewById(R.id.reset_button);

        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newPassword.getText().toString().trim().length() >= 6) {
                    if (newPassword.getText().toString().trim().equals(reenterPassword.getText().toString().trim())) {
                        Toast.makeText(getBaseContext(), "Password successfully changed", Toast.LENGTH_SHORT).show();
                        // Add new password to firebase

                    } else
                        Toast.makeText(getBaseContext(), "Password does not match !!", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(getBaseContext(), "Password must be atleast 6 characters long !!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
