package ws.munday.androidscalabase

import scala.util.Properties
import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity extends Activity {
    
    override def onCreate(savedInstanceState:Bundle) : Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val textView = findViewById( R.id.main_text ).asInstanceOf[TextView]
        textView setText(Properties.versionMsg)
    }
  
}