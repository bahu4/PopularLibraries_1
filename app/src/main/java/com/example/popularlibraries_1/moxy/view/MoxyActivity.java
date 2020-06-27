package com.example.popularlibraries_1.moxy.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.popularlibraries_1.R;
import com.example.popularlibraries_1.moxy.presenter.MoxyPresenter;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class MoxyActivity extends MvpAppCompatActivity implements MoxyView {

    private static final String TAG = "com.example.homework_1.moxy.view";

    Button btnOk;
    EditText editText;
    TextView textView;

    @InjectPresenter
    MoxyPresenter presenter;

    @ProvidePresenter
    public MoxyPresenter providePresenter() {
        return new MoxyPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moxy);
        initView();
        Log.d(TAG, "onCreate: ");
        onClick(btnOk);
    }

    private void onClick(Button btn) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onOkBtnClick(editText.getText().toString());
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
}