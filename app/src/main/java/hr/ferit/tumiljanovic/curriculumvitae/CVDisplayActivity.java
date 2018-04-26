package hr.ferit.tumiljanovic.curriculumvitae;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CVDisplayActivity extends AppCompatActivity {


    @BindView(R.id.Name_EditText) EditText ET_name;
    @BindView(R.id.School_EditText) EditText ET_education_school;
    @BindView(R.id.Faculty_EditText) EditText ET_education_faculty;
    @BindView(R.id.skill_1_EditText) EditText ET_skill_1;
    @BindView(R.id.skill_2_EditText) EditText ET_skill_2;
    @BindView(R.id.skill_3_EditText) EditText ET_skill_3;
    @BindView(R.id.skill_4_EditText) EditText ET_skill_4;
    @BindView(R.id.skill_5_EditText) EditText ET_skill_5;
    @BindView(R.id.mobile_contact_edittext) EditText ET_mobile_contact;
    @BindView(R.id.email_edittext) EditText ET_email_contact;
    @BindView(R.id.location_edittext) EditText ET_location;
    @BindView(R.id.about_me_edittext) EditText ET_about_me;
    @BindView(R.id.experience_edittext) EditText ET_experience;
    @BindView(R.id.facebook_EditText) EditText ET_facebook;
    @BindView(R.id.skype_EditText) EditText ET_skype;
    @BindView(R.id.twitter_EditText) EditText ET_twitter;
    @BindView(R.id.Edit_Button) Button bEdit;
    @BindView(R.id.skill_1_progressbar) ProgressBar PB_skill_1;
    @BindView(R.id.skill_2_progressbar) ProgressBar PB_skill_2;
    @BindView(R.id.skill_3_progressbar) ProgressBar PB_skill_3;
    @BindView(R.id.skill_4_progressbar) ProgressBar PB_skill_4;
    @BindView(R.id.skill_5_progressbar) ProgressBar PB_skill_5;

    boolean editMode=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvdisplay);
        ButterKnife.bind(this);

    }

    @OnClick (R.id.skill_1_progressbar)
    public void editPB_1(){
        int previousProgress= PB_skill_1.getProgress();
        if(editMode==true){
            if(previousProgress<10){
                PB_skill_1.setProgress(previousProgress+1);
             }
             else{
                PB_skill_1.setProgress(1);
            }
        }

    }

    @OnClick(R.id.skill_2_progressbar)
    public void editPB_2(){
        int previousProgress= PB_skill_2.getProgress();
        if(editMode==true){
            if(previousProgress<10){
                PB_skill_2.setProgress(previousProgress+1);
            }
            else{
                PB_skill_2.setProgress(1);
            }
        }

    }

    @OnClick(R.id.skill_3_progressbar)
    public void editPB_3(){
        int previousProgress= PB_skill_3.getProgress();
        if(editMode==true){
            if(previousProgress<10){
                PB_skill_3.setProgress(previousProgress+1);
            }
            else{
                PB_skill_3.setProgress(1);
            }
        }

    }


    @OnClick(R.id.skill_4_progressbar)
    public void editPB_4(){
        int previousProgress= PB_skill_4.getProgress();
        if(editMode==true){
            if(previousProgress<10){
                PB_skill_4.setProgress(previousProgress+1);
            }
            else{
                PB_skill_4.setProgress(1);
            }
        }

    }


    @OnClick(R.id.skill_5_progressbar)
    public void editPB_5(){
        int previousProgress= PB_skill_5.getProgress();
        if(editMode==true){
            if(previousProgress<10){
                PB_skill_5.setProgress(previousProgress+1);
            }
            else{
                PB_skill_5.setProgress(1);
            }
        }

    }


    @OnClick (R.id.Edit_Button)
    public void editCV(){
        setEditMode();
        if(editMode==true) {
            bEdit.setBackgroundResource(R.drawable.tick_icon);
            enableAll();
            editAll();
        }
        else{
            bEdit.setBackgroundResource(R.drawable.edit_icon);
            disableAll();
        }

    }

    private void disableAll() {
        ET_name.setEnabled(false);
        ET_education_faculty.setEnabled(false);
        ET_education_school.setEnabled(false);
        ET_skill_1.setEnabled(false);
        ET_skill_2.setEnabled(false);
        ET_skill_3.setEnabled(false);
        ET_skill_4.setEnabled(false);
        ET_skill_5.setEnabled(false);
        ET_mobile_contact.setEnabled(false);
        ET_email_contact.setEnabled(false);
        ET_location.setEnabled(false);
        ET_about_me.setEnabled(false);
        ET_experience.setEnabled(false);
        ET_facebook.setEnabled(false);
        ET_skype.setEnabled(false);
        ET_twitter.setEnabled(false);
    }

    private void editAll() {
        ET_name.setText(ET_name.getText().toString());
        ET_education_faculty.setText(ET_education_faculty.getText().toString());
        ET_education_school.setText(ET_education_school.getText().toString());
        ET_skill_1.setText(ET_skill_1.getText().toString());
        ET_skill_2.setText(ET_skill_2.getText().toString());
        ET_skill_3.setText(ET_skill_3.getText().toString());
        ET_skill_4.setText(ET_skill_4.getText().toString());
        ET_skill_5.setText(ET_skill_5.getText().toString());
        ET_mobile_contact.setText(ET_mobile_contact.getText().toString());
        ET_email_contact.setText(ET_email_contact.getText().toString());
        ET_location.setText(ET_location.getText().toString());
        ET_about_me.setText(ET_about_me.getText().toString());
        ET_experience.setText(ET_experience.getText().toString());
        ET_facebook.setText(ET_facebook.getText().toString());
        ET_skype.setText(ET_skype.getText().toString());
        ET_twitter.setText(ET_twitter.getText().toString());

    }

    private void enableAll() {
        ET_name.setEnabled(true);
        ET_education_faculty.setEnabled(true);
        ET_education_school.setEnabled(true);
        ET_skill_1.setEnabled(true);
        ET_skill_2.setEnabled(true);
        ET_skill_3.setEnabled(true);
        ET_skill_4.setEnabled(true);
        ET_skill_5.setEnabled(true);
        ET_mobile_contact.setEnabled(true);
        ET_email_contact.setEnabled(true);
        ET_location.setEnabled(true);
        ET_about_me.setEnabled(true);
        ET_experience.setEnabled(true);
        ET_facebook.setEnabled(true);
        ET_skype.setEnabled(true);
        ET_twitter.setEnabled(true);
    }

    private void setEditMode() {
        if(editMode==false){
            editMode=true;
        }
        else editMode=false;
    }


}


