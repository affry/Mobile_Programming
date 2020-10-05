package id.ac.poltektegal.belajarrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    val list1 = ArrayList<Users>()
    listusers = arrayOf("Alpha","Bravo","Charlie","Delta","Echo","Foxtrot","Golf","Hotel","India","Juliet")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecycleView.setHasFixedSize(true)
        mRecycleView.layoutManager = LinearLayoutManager(context:this)
        for (i in 0 until listusers.size)
            list1.add(Users(listusers.get(i)))
        if (listusers.size - 1 == i){
            val adapter = Adapter(list1)
            adapter.notifyDataSetChanged()
            mRecycleView.adapter = adapter
        }
    }
}
