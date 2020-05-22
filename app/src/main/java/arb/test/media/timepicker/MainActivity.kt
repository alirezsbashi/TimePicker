package arb.test.media.timepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        time.setIs24HourView(true)

        time.setOnTimeChangedListener { view, hourOfDay, minute ->
            tv.text = "$hourOfDay : $minute"
        }

        tv.setOnClickListener {
            Toast.makeText(this,"${time.currentHour} : ${time.currentMinute}",Toast.LENGTH_LONG).show()
        }
    }
}
