package uz.oybekdev.a01_listviewandadapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import uz.oybekdev.a01_listviewandadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private val fruite = arrayListOf<String>("Olma","Banan","Shaftoli","Uzum")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fruite)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener{_,_,position,_ ->
            //bizga keremaslarini _ qilsak error bermaydi
            Toast.makeText(this,"${fruite[position]} tanlandi",Toast.LENGTH_SHORT).show()
            Intent(this,FruitImageActivity::class.java).apply {
                this.putExtra("position",position)
                startActivity(this)
            } //keyingi activityga otish
        }
    }
}