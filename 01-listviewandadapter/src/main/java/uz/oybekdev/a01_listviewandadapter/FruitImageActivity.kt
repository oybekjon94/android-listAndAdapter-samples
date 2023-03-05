package uz.oybekdev.a01_listviewandadapter

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import uz.oybekdev.a01_listviewandadapter.databinding.ActivityFruitImageBinding

class FruitImageActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFruitImageBinding
    private val fruits = arrayListOf<String>("Olma","Banan","Shaftoli","Uzum")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val position = intent.getIntExtra("position",0)

        supportActionBar?.title = fruits[position]

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        when(position){
            0 -> binding.fruitImage.setImageResource(R.drawable.apple)
            1 -> binding.fruitImage.setImageResource(R.drawable.banana)
            2 -> binding.fruitImage.setImageResource(R.drawable.peach)
            3 -> binding.fruitImage.setImageResource(R.drawable.grapes)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}