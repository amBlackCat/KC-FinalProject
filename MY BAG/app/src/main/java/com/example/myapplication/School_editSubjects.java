package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class School_editSubjects extends AppCompatActivity {

    List<Days> daysList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_edit_subjects);

        // // // // //

        TextView dayShow = findViewById(R.id.dayShow);


        Bundle bundel = getIntent().getExtras();

        Days s = (Days) bundel.getSerializable("day");
        dayShow.setText(s.getDay());

        int i = s.getDayId();

        // // // // //

        EditText edtSub1 = findViewById(R.id.editSub1);
        EditText edtSub2 = findViewById(R.id.editSub2);
        EditText edtSub3= findViewById(R.id.editSub3);
        EditText edtSub4 = findViewById(R.id.editSub4);
        EditText edtSub5 = findViewById(R.id.editSub5);
        EditText edtSub6 = findViewById(R.id.editSub6);
        EditText edtSub7 = findViewById(R.id.editSub7);

        // // // // //

        Button doneBtn = findViewById(R.id.doneBTN);

        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back2list = new Intent(School_editSubjects.this, Details_schoolBag.class);

                // // //

                String sub1 = (edtSub1.getText().toString());
                String sub2 = (edtSub2.getText().toString());
                String sub3 = (edtSub3.getText().toString());
                String sub4 = (edtSub4.getText().toString());
                String sub5 = (edtSub5.getText().toString());
                String sub6 = (edtSub6.getText().toString());
                String sub7 = (edtSub7.getText().toString());

                // // //

               // Days currentDay = daysList.get(i);
              //  currentDay.setSub1(sub1);



                // // //

                if (edtSub1.getText().toString().equals("")){


                } else if (edtSub2.getText().toString().equals("")){


                }else if (edtSub3.getText().toString().equals("")){


                }else if (edtSub4.getText().toString().equals("")){


                }else if (edtSub5.getText().toString().equals("")){


                }else if (edtSub6.getText().toString().equals("")){


                }else if (edtSub7.getText().toString().equals("")){


                }else {

                    back2list.putExtra("sub1", sub1);
                    back2list.putExtra("sub2", sub2);
                    back2list.putExtra("sub3", sub3);
                    back2list.putExtra("sub4", sub4);
                    back2list.putExtra("sub5", sub5);
                    back2list.putExtra("sub6", sub6);
                    back2list.putExtra("sub7", sub7);


                    startActivity(back2list);
                }


            }
        });

        // // // // //

        ImageView back2main = findViewById(R.id.back2class);







    }
}