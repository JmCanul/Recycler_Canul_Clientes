package com.example.recycler_canul_clientes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaProductos: MutableList<dtProductos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaProductos.add(
            dtProductos("1","Javon para lavar manos","$18.90", "$17.00"))

        listaProductos.add(
            dtProductos("2","Javon para lavar trastes","$13.40", "$15.00"))

        listaProductos.add(
            dtProductos("3","Javon para lavar ropa","$12.5", "$14.00"))

        listaProductos.add(
            dtProductos("4","Javon Multiusos","$18.90", "$17.00"))

        listaProductos.add(
            dtProductos("5","Jamon","16.50", "$15.00"))

        listaProductos.add(
            dtProductos("6","Tocino","$22.50", "$20.5"))

        listaProductos.add(
            dtProductos("7","Papel higienico","$6.00", "$4.00"))

        listaProductos.add(
            dtProductos("8","Chicharos","$13.00", "$12.50"))

        listaProductos.add(
            dtProductos("9","Maiz Enlatado","$12.00", "$11.00"))

        listaProductos.add(
            dtProductos("10","Zardina","$26.00", "$25.00"))

        listaProductos.add(
            dtProductos("11","Atun","$16.00", "$14.00"))

        listaProductos.add(
            dtProductos("12","Tomates","$4.20", "$3.00"))

        listaProductos.add(
            dtProductos("13","Platano","16.50", "15.20"))

        listaProductos.add(
            dtProductos("14","Manzana","$13.5", "$12.5"))

        listaProductos.add(
            dtProductos("15","Desodorante En Barras","$55.5", "$31.00"))

        listaProductos.add(
            dtProductos("16","Desodorante en aerosol","$42.00", "$39.50"))

        listaProductos.add(
            dtProductos("17","Galletas","12.00", "11.00"))

        listaProductos.add(
            dtProductos("18","pan","$6.00", "$5.00"))

        listaProductos.add(
            dtProductos("19","Leche liquida","$20.15", "$19.80"))

        listaProductos.add(
            dtProductos("20","Leche en polvo","$15.5", "$14.00"))

        var tabla = findViewById<RecyclerView>(R.id.tablaProductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=productosAdapter(this,listaProductos)

    }
}