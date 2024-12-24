package com.example.myapplicationlern;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button addStudentBtn = findViewById(R.id.addStudentBtn);
        Button checkStudentBtn = findViewById(R.id.checkStudentBtn);
        Button logSortedGradesBtn = findViewById(R.id.logSortedGradesBtn);
        TextView etGrade = findViewById(R.id.etGrade);
        TextView etStudentName = findViewById(R.id.etStudentName);
        TextView tvStudentGrade = findViewById(R.id.tvStudentGrade);
        TextView etStudentQuery = findViewById(R.id.etStudentQuery);
        ArrayList<Student> Studentlist = new ArrayList<>();
        addStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student tempStudent = new Student();
                tempStudent.name = etStudentName.getText().toString();
                tempStudent.grade=Integer.parseInt(tvStudentGrade.getText().toString());
                studentList.add
            }
        });




    }
}