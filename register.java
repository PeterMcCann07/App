
package com.example.app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

    public class register extends AppCompatActivity {
        private EditText et_firstname, et_email, et_password, et_surname, et_studid;

        private CoordinatorLayout coordinatorLayout;
        private ImageButton imageButtonBack;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.register);

            // coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
            Button btn_register = findViewById(R.id.btn_register);
            // tv_login = (TextView)view.findViewById(R.id.tv_login);
            et_firstname = findViewById(R.id.txtfirstname);
            et_email = findViewById(R.id.txtemail);
            et_password = findViewById(R.id.txtpwd);
            et_surname = findViewById(R.id.txtsurname);
            et_studid = findViewById(R.id.txtstudid);
            //  registerProcess("66", "765y", "ukr7", "ss@ss.com", "yukr7");
            btn_register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String fname = et_firstname.getText().toString();
                    String lname = et_surname.getText().toString();
                    String student = et_studid.getText().toString();
                    String email = et_email.getText().toString();
                    String password = et_password.getText().toString();


                    if (!fname.isEmpty() && !email.isEmpty() && !password.isEmpty()) {

                        registerProcess(fname, lname, student, email, password);

                    } else {
                        if (email.isEmpty()) {
                            et_email.setError("Email is required");

                        }
                        //   Snackbar.make(, "Field's are empty !", Snackbar.LENGTH_LONG).show();
                    }
                }
            });
        }

        private void registerProcess(String fname, String lname, String studentid, String email, String password) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RequestInterface requestInterface = retrofit.create(RequestInterface.class);

            User user = new User();
            user.setFirstname(fname);
            user.setSurname(lname);
            user.setEmail(email);
            user.setPassword(password);
            user.setStudentid(studentid);
            user.setType("1");
            user.setStatus("1");
            ServerRequest request = new ServerRequest();
            request.setOperation(Constants.REGISTER_OPERATION);
            request.setUser(user);
            retrofit2.Call<ServerResponse> response = requestInterface.operation(request);

            response.enqueue(new Callback<ServerResponse>() {
                @Override
                public void onResponse(retrofit2.Call<ServerResponse> call, retrofit2.Response<ServerResponse> response) {

                    ServerResponse resp = response.body();
                    AlertDialog alertDialog;
                    if (resp.getResult().equals(Constants.SUCCESS)) {

                        alertDialog = new AlertDialog.Builder(register.this).create();
                        alertDialog.setTitle("save");
                        alertDialog.setMessage(resp.getMessage());
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                    } else {

                        alertDialog = new AlertDialog.Builder(register.this).create();
                        alertDialog.setTitle("save");
                        alertDialog.setMessage(resp.getMessage());
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });

                    }
                    alertDialog.show();
                    //Snackbar.make(this, resp.getMessage(), Snackbar.LENGTH_LONG).show();
                    //  goToLogin();
                    Log.d(Constants.TAG, "gfgffgfgfg" + response.code());
                    Log.d(Constants.TAG, "gfgffgfgfg" + response.message());
                    Log.d(Constants.TAG, "gfgffgfgfg" + response.errorBody());
                    Log.d(Constants.TAG, "gfgffgfgfg" + response.isSuccessful());

                    openLogInPage();
                }

                @Override
                public void onFailure(retrofit2.Call<ServerResponse> call, Throwable t) {

                }

            });
        }
        public void openLogInPage(){
            Intent intentRS = new Intent(this, LogInScreen.class);
            startActivity(intentRS);
        }
        }

