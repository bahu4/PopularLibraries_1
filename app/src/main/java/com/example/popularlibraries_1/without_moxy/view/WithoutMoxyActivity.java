package com.example.popularlibraries_1.without_moxy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.popularlibraries_1.R;
import com.example.popularlibraries_1.without_moxy.presenter.WithoutMoxyPresenter;

public class WithoutMoxyActivity extends AppCompatActivity implements WithoutMoxyView {

    private static final String TAG = "com.example.homework_1";

    Button btnOk;
    EditText editText;
    TextView textView;
    WithoutMoxyPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Log.d(TAG, "onCreate: ");
        onClick(btnOk);

        presenter = new WithoutMoxyPresenter(this);
    }

    private void onClick(Button btn) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onOkBtnClick();
                editText.setText("");
            }
        });
    }

    private void initView() {
        btnOk = findViewById(R.id.ok);
        editText = findViewById(R.id.edtiText);
        textView = findViewById(R.id.textView);
    }

    @Override
    public void setText(String msg) {
        textView.setText(textView.getText() + msg);
    }

    @Override
    public String getText() {
        String msg = editText.getText().toString();
        return msg;
    }
}