package edu.purdue.mtaddevi.lab;

import android.view.View.*;
import android.view.View;
import java.util.*;
import android.os.*;
import android.widget.*;
public class Listener implements OnClickListener{
public void onClick(View arg){
  Button b = (Button)arg;
    String s = b.getText().toString();
    if(s == "Reset"){  
  StartActivity.logIt("pants");
    }
    if(s == "Time"){  
  StartActivity.logIt("box");
    }
    if(s == "Serial"){  
  StartActivity.logIt("batman");
    }
}
}



