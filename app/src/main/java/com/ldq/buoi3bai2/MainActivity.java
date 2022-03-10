package com.ldq.buoi3bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Spinner student;
    TextView txtStu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Spinner Planet
        spinner = findViewById(R.id.spinerPlanet);
        ArrayAdapter<CharSequence> adapterPlanet = ArrayAdapter.createFromResource(this,R.array.planet_array,
                android.R.layout.simple_spinner_item);
        adapterPlanet.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterPlanet);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String planet =(String) adapterView.getItemAtPosition(i);
                String txt = "Ur from " + planet;
                Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Spinner Student
        student = findViewById(R.id.spinerPlanet2);
        Student[] lst = getStudent();
        ArrayAdapter<Student> adapterS = new ArrayAdapter<Student>(this,
                android.R.layout.simple_spinner_dropdown_item,lst);
        adapterS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        student.setAdapter(adapterS);
        student.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Student s = (Student) adapterView.getItemAtPosition(i);
                String str = "StudentID: " + s.getId() +"\n";
                str+="Fullname: " + s.getName() +"\n";
                str+="Phone: " + s.getPhone() +"\n";
                str+="Email: " + s.getEmail() +"\n";
                txtStu = findViewById(R.id.txtStu);
                txtStu.setText(str);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    private Student[] getStudent(){
        Student s1 = new Student("1854060203","Le Da Quynh","CS82","000000009","181949quynh@ou.edu.vn");
        Student s2 = new Student("1854060203","Le Quynh","CS82","000000009","181949quynh@ou.edu.vn");
        Student s3 = new Student("1854060203","Le 2 Quynh","CS82","000000009","181949quynh@ou.edu.vn");
        Student s4 = new Student("1854060203","Le 3 Quynh","CS82","000000009","181949quynh@ou.edu.vn");
        Student s5 = new Student("1854060203","Le 4 Quynh","CS82","000000009","181949quynh@ou.edu.vn");
        Student s6 = new Student("1854060203","Le 5 Quynh","CS82","000000009","181949quynh@ou.edu.vn");
        return new Student[]{s1,s2,s3,s4,s5,s6};
    }

}