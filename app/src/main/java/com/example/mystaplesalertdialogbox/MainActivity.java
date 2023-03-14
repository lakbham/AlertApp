package com.example.mystaplesalertdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.app.AlertDialog;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.Html;

public class MainActivity extends AppCompatActivity {
    TextView myCustomMessage2;

    double Mixed = 0;
    double Color = 0;
    Integer IBandW = 3;
    double val1 = 0.19 * 2;
    double val2 = 0.57 * 2;
    double val3 = val2 - val1;
    String dis1 = "";
    String dis2 = "";
    String dis3 = "";
    String BW = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCustomMessage2 = (TextView) findViewById(R.id.myCustommessage2);
    }

 public void btn_showMessage1(View view) {
        ShowUpsellDialog1(view);
    }
 public void btn_showMessage2(View view) {
      if (Color == 0 && Mixed == 0 && IBandW == 3) {
          ShowUpsellDialog2(view);
      }
  }
  public void btn_showMessage3(View view){
      if (Color == 0 && Mixed == 0 && IBandW == 3) {
          ShowUpsellDialog3(view);
      }
      }

    public void ShowUpsellDialog1(View view) {
        final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.custom_dialog,null);
        Button btn_cancel = (Button)mView.findViewById(R.id.btn_cancel);
        Button btn_okay = (Button)mView.findViewById(R.id.btn_okay);
        alert.setView(mView);
        final AlertDialog alertDialog = alert.create();
        alertDialog.setCanceledOnTouchOutside(false);
        ImageView iv = mView.findViewById(R.id.up);
        TextView title = (TextView)mView.findViewById(R.id.upmsg);
        SpannableStringBuilder builder=new SpannableStringBuilder()
                .append(formatString(this,R.string.big_red, R.style.BigRedTextAppearence))
                .append("\n")
                .append(formatString(this,R.string.medium_green, R.style.MediumGreenTextAppearence))
                .append("\n")
                .append(formatString(this,R.string.small_blue, R.style.SmallBlueTextAppearence));

        title.setText(builder.subSequence(0,builder.length()));

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCustomMessage2.setText("'No' selected");

                alertDialog.dismiss();
            }
        });
        btn_okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCustomMessage2.setText("'Yes' selected");
                alertDialog.dismiss();
            }
        });
        alertDialog.show();
    }

    static SpannableString formatString(Context context, int textId
            , int styleId){
        String text=context.getString(textId);
        SpannableString  spannableString=new SpannableString(text);
        spannableString.setSpan(new TextAppearanceSpan(context, styleId),0,text.length(),0);
        return  spannableString;
    }

   public void ShowUpsellDialog2(View view) {
              final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
              View mView = getLayoutInflater().inflate(R.layout.custom_dialog,null);
              Button btn_cancel = (Button)mView.findViewById(R.id.btn_cancel);
              Button btn_okay = (Button)mView.findViewById(R.id.btn_okay);
              alert.setView(mView);
              final AlertDialog alertDialog = alert.create();
              alertDialog.setCanceledOnTouchOutside(false);
              ImageView iv = mView.findViewById(R.id.up);
              TextView title = (TextView)mView.findViewById(R.id.upmsg);
              String v1=String.valueOf(val1);
              String v2=String.valueOf(val2);
              String v3=String.valueOf(val3);
              String v4=String.valueOf(IBandW);
              title.setText("Would you like to upgrade your B & W \ncopies which cost $"+v1+ " \nfor " +v4+" pages to color for $"+v2+"!\n\n The difference in price\n is $"+ (String.format("%.2f",val3)).toString()+"!");
              btn_cancel.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      myCustomMessage2.setText("'No' selected");

                      alertDialog.dismiss();
                  }
              });
              btn_okay.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      myCustomMessage2.setText("'Yes' selected");
                      alertDialog.dismiss();
                  }
              });
              alertDialog.show();
          }

 public void ShowUpsellDialog3(View view) {
              final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
              View mView = getLayoutInflater().inflate(R.layout.custom_dialog,null);
              Button btn_cancel = (Button)mView.findViewById(R.id.btn_cancel);
              Button btn_okay = (Button)mView.findViewById(R.id.btn_okay);
              alert.setView(mView);
              final AlertDialog alertDialog = alert.create();
              alertDialog.setCanceledOnTouchOutside(false);
              ImageView iv = mView.findViewById(R.id.up);
              TextView title = (TextView)mView.findViewById(R.id.upmsg);
     title.setText(Html.fromHtml(getResources().getString(R.string.val11)));
              btn_cancel.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      myCustomMessage2.setText("'No' selected");

                      alertDialog.dismiss();
                  }
              });
              btn_okay.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      myCustomMessage2.setText("'Yes' selected");
                      alertDialog.dismiss();
                  }
              });
              alertDialog.show();
          }
}
