package com.example.horizontalscrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontalscrollview.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gridview:GridView=findViewById(R.id.GV)
        var RecyclerView:RecyclerView=findViewById(R.id.recyclerview)

        //creating list of applist which is
        lateinit var customadapter: CustomAdapter
        var applist:List<model>
        applist=ArrayList<model>()

        //adding name and image to applist
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("home",R.drawable.home1)
        applist=applist+model("camera",R.drawable.camera1)
        applist=applist+model("android",R.drawable.android1)
        applist=applist+model("camera",R.drawable.camera1)


        //connecting applist with adapter
        val gridadapter=gridadapter(applist=applist,this@MainActivity)
        //connecting gridview(main layout) and adapter
        gridview.adapter=gridadapter;

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        RecyclerView.layoutManager = layoutManager

        customadapter = CustomAdapter(applist)
        RecyclerView.adapter = customadapter

        //customadapter.setClickListener(this)



//
//        gridview.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
//            //(parent, view, position, id)
//            // inside on click method we are simply displaying
//            // a toast message with course name.
//
//            Toast.makeText(
//                applicationContext, applist[position].appname + " selected",
//                Toast.LENGTH_SHORT
//            ).show()
//        }
    }
}