package com.example.lenovo.vsproject.Fragment;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.NestedScrollView;

import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.telecom.Call;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.lenovo.vsproject.Activity.RegisterActivity;
import com.example.lenovo.vsproject.Api.URLs;
import com.example.lenovo.vsproject.Api.VolleySingleton;
import com.example.lenovo.vsproject.Model.User;
import com.example.lenovo.vsproject.R;
import com.example.lenovo.vsproject.SharedPrefManager;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class FragmentProfile extends Fragment implements View.OnClickListener {

//,UserDetails.OnFragmentInteractionListener

    private NestedScrollView nestedScrollView;
    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutPassword;
    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextPassword;
    private AppCompatButton appCompatButtonLogin;
    private AppCompatTextView textViewLinkRegister;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);



        if(SharedPrefManager.getInstance(getContext()).isLoggedIn()){

//             if  user already loged in to do
            Fragment fragment= new UserDetails();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragment); // fragment container id in first parameter is the  container(Main layout id) of Activity
            transaction.addToBackStack(null);  // this will manage backstack
            transaction.commit();
        }

        initViews(v);
        initListeners();
        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void initViews(View v) {

        nestedScrollView = (NestedScrollView) v.findViewById(R.id.nestedScrollView);

        textInputLayoutEmail = (TextInputLayout) v.findViewById(R.id.textInputLayoutEmail);
        textInputLayoutPassword = (TextInputLayout) v.findViewById(R.id.textInputLayoutPassword);

        textInputEditTextEmail = (TextInputEditText) v.findViewById(R.id.textInputEditTextEmail);
        textInputEditTextPassword = (TextInputEditText) v.findViewById(R.id.textInputEditTextPassword);

        appCompatButtonLogin = (AppCompatButton) v.findViewById(R.id.appCompatButtonLogin);

        textViewLinkRegister = (AppCompatTextView) v.findViewById(R.id.textViewLinkRegister);

    }
    /**
     * This method is to initialize listeners
     */
    private void initListeners() {
        appCompatButtonLogin.setOnClickListener(this);
        textViewLinkRegister.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.appCompatButtonLogin:
                userLogin();
                break;
            case R.id.textViewLinkRegister:
                // Navigate to RegisterActivity
                Intent intentRegister = new Intent(getActivity(),RegisterActivity.class);
                startActivity(intentRegister);
                break;
        }
    }
    private void userLogin() {
        //first getting the values
        final String email = textInputEditTextEmail.getText().toString();
        final String password = textInputEditTextPassword.getText().toString();

        //validating inputs
        if (TextUtils.isEmpty(email)) {
            textInputEditTextEmail.setError("Please enter your email");
            textInputEditTextEmail.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            textInputEditTextPassword.setError("Please enter your password");
            textInputEditTextPassword.requestFocus();
            return;
        }

        //if everything is fine
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URLs.URL_LOGIN,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                       // progressBar.setVisibility(View.GONE);

                        try {
                            //converting response to json object
                            JSONObject obj = new JSONObject(response);

                            //if no error in response
                            if (!obj.getBoolean("error")) {
                                Toast.makeText(getContext(), obj.getString("message"), Toast.LENGTH_SHORT).show();

                                //getting the user from the response
                                JSONObject userJson = obj.getJSONObject("user");

                                //creating a new user object
                                User user = new User(
                                        userJson.getInt("id"),
                                        userJson.getString("username"),
                                        userJson.getString("email")
                                );

                                //storing the user in shared preferences
                                SharedPrefManager.getInstance(getContext()).userLogin(user);

                                //starting the profile activity
                               // finish();
                                //startActivity(new Intent(getContext(), UserDetails.class));
//                                Fragment fragment= new UserDetails();
//                                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                                transaction.replace(R.id.fragment_container, fragment); // fragment container id in first parameter is the  container(Main layout id) of Activity
//                                transaction.addToBackStack(null);  // this will manage backstack
//                                transaction.commit();

                            } else {
                                Toast.makeText(getContext(), obj.getString("message"), Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }


                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("email", email);
                params.put("password", password);
                return params;
            }
        };

        VolleySingleton.getInstance(getContext()).addToRequestQueue(stringRequest);
    }


}