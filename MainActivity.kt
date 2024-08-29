package example.javatpoint.com.kotlinexplicitintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.testingapp.R

lateinit var button: Button
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        button = findViewById(R.id.btn)

        button.setOnClickListener(){
            intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}
