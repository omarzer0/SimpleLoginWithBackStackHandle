package az.omar.jobtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import az.omar.jobtest.utils.Utils.toStartFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toStartFragment(supportFragmentManager)
    }
}