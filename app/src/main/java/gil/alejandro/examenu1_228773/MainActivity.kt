package gil.alejandro.examenu1_228773

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etC: EditText = findViewById(R.id.etC)
        val etF: EditText = findViewById(R.id.etF)
        val btnGC: Button = findViewById(R.id.btnGC)
        val btnGF: Button = findViewById(R.id.btnGF)

        var gC: Double = 0.0
        var gF: Double = 0.0

        btnGC.setOnClickListener{
            if(etF.text.isBlank()) gF = 0.0
            else gF = etF.text.toString().toDouble()
            gC = (gF-32) / 1.8
            etC.setText(gC.toString())
        }

        btnGF.setOnClickListener{
            if(etC.text.isBlank())gC = 0.0
            else gC = etC.text.toString().toDouble()
            gF = gC * 1.8 + 32
            etF.setText(gF.toString())
        }
    }
}