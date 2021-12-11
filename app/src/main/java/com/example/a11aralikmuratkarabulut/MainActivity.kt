package com.example.a11aralikmuratkarabulut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Liste toplama sonucu  ", toplam(5,7).toString()) // toplam fonksiyonu ile 5+7 yi topladı
        checkiflesson()
        checkwhenlesson()
        processArraylist()
        findEvenOrOdd()
        findEvenorOddForeach()
        processMultiTypeArrayList()
        processforX()
        filter()
        nameSplit()
    }
    fun nameSplit(){
        var name="Burak Başaran"
        Log.i("Liste string işlemler", name.uppercase()) // tüm harfleri büyük yazdır
        Log.i("Liste string işlemler", name.lowercase()) // tüm harfleri küçük yazdır
        Log.i("Liste string işlemler", name.plus("Derste")) // sonuna bu kelimeyi ekle
        Log.i("Liste string işlemler", name.get(3).toString()) //3. harfi göster
        Log.i("Liste string işlemler", name.substring(0,5)) // bu aralıkları yazdır

        //isim soyisim bölmek için kullanılmaktadır. " " ile boşluğa göre ayırıyor
        var splitname=name.split(" ").toTypedArray()
        Log.i("Liste split", splitname.get(0)+"-----"+splitname.get(1))

        var namesplit=splitname.get(0).substring(0,1) // adın ilk harfini yazdır
        var surnamesplit=splitname.get(1).get(0)  // soyadın ilk harfini yazdır

        Log.i("Liste Adın ", namesplit.plus("******")) // sonuna  ** ekle
        Log.i("Liste Soyadın",surnamesplit+"******") // sonuna ** ekle
    }
    fun findEvenOrOdd(){
        var sayilar:ArrayList<Int> = arrayListOf()
        for (i in 0..10){
            sayilar.add(i)
            when (sayilar.get(i)%2){
                0->{
                Log.i("When Liste Sayı Çift",sayilar.get(i).toString())
                }
             1->
            {
                Log.i("When Liste Sayı tek", sayilar.get(i).toString())
            }
            }
        }
    }
    fun findEvenorOddForeach(){
        var sayilar2:ArrayList<Int> = arrayListOf()
        for(i in 0..10){
            sayilar2.add((i))
        }
        sayilar2.forEach{
            when(it%2){  // foreach dizide ki her elemanıyla sırayla döndürür, it ile o dönen elemanı alıyorsun
                0->{
                    Log.i("Foreach Liste Sayı Çift",it.toString())
                }
                1->{
                    Log.i("Foreach Liste Sayı Tek",it.toString())
                }
            }
        }
    }
    fun checkiflesson(){
        var Dersvarmi=true
        if(Dersvarmi){
            Toast.makeText(this,"Ders Var", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this,"Ders Yok", Toast.LENGTH_SHORT).show()
        }
    }
    fun checkwhenlesson(){
        var kelime="a"
        when(kelime){
            "a"->{
                Toast.makeText(this,"Kelime A", Toast.LENGTH_SHORT).show()
            }
            "b"->{
                Toast.makeText(this,"Kelime B", Toast.LENGTH_SHORT).show()
            }else ->{
            Toast.makeText(this,"Kelime Yok", Toast.LENGTH_SHORT).show()
        }
        }
    }
    fun processArraylist(){
        var liste:ArrayList<String> = arrayListOf() //liste isimli bir liste oluşumu
        liste.add("Ahmet")
        liste.add("Mehmet")
        liste.add("Yusuf")
        liste.add("aaa")
        liste.add("abb")

        Log.i("Liste İlk Eleman", liste.first()) //listenin ilk elemanı
        Log.i("Liste Son Eleman", liste.last())  // listenin son elemanı
        Log.i("Liste boyut", liste.size.toString())  // listenin uzunluğu

        // liste.get(1) //satır getirmek için
        // liste.removeAt(0) //listenin 0 ıncı elemanını silmek için

        liste.forEach{
            Log.i(" foreach liste x", it)
            Toast.makeText(this,it, Toast.LENGTH_SHORT).show()
        }

    }
    fun processMultiTypeArrayList(){
        var allTypeList:ArrayList<Any> = arrayListOf()
        allTypeList.add("Ahmet")
        allTypeList.add(5)
        allTypeList.add(0.3)
    }
    fun processforX(){

        for(x in 0..3){
          Toast.makeText(this,"Merhaba $x", Toast.LENGTH_SHORT).show()
        }
    }
    fun toplam(sayi:Int, sayi2:Int): Int{
        return sayi+sayi2
    }
    fun filter(){
        var cityList:ArrayList<String> = arrayListOf()
        cityList.add("istanbul")
        cityList.add("İzmir")
        cityList.add("Malatya")
        cityList.add("Sivas")
        cityList.add("İzmir")
        cityList.add("Ankara")
        cityList.add("İzmir")
        cityList.add("İzmit")

        val cityTempList:ArrayList<String> = arrayListOf()
        // cityTempList.addAll(cityList.filter { it == "İzmir" })
        cityList.filter { cityName ->
            cityName == "İzmir" }.forEach{ filterlast ->
             cityTempList.add(filterlast)      // ismi İzmir olan şehirleri cityTempList dizisine ekliyor
        }
        Log.i("Liste Boyutu ",cityList.filter { cityName ->
            cityName == "İzmir" }.size.toString())  // filtreye uyan kaç adet şehir var
        cityTempList.forEach{
            Log.i("Liste şehir ismi ", it)  // filtreye uyan isimleri yazıyor

        }

        }

}