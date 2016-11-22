package com.yeho.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String	mensaje	=	"";
        try	{
            Uri uri	=	Uri.parse("https://medusa-hosting.com");
            Intent intent	=	new	Intent(Intent.ACTION_VIEW,	uri);
            startActivity(intent);
            mensaje	=	"abrimos una pagina web sin el permiso android.permission.INTERNET ";
        }
        catch	(Exception	e)	{
            mensaje	=	e.toString()	+	"\n"	+	e.getCause();
        }
        TextView tv	=	new TextView(this);
        tv.setTextSize(40);
        tv.setText(mensaje);
        tv.setTypeface(null, Typeface.BOLD);
        setContentView(tv);
    }
}
