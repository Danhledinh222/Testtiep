package com.example.lamquen_2415053122308

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lamquen_2415053122308.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var luotCuoi_2308: Luotnhan? =null
    private var demLuot=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        binding.btnKiemTra.setOnClickListener {
            kiemTra_2308()
        }
        binding.btnXoa.setOnClickListener {
            xoa_2308()
        }
    }
    fun kiemTra_2308(){
        val tenChuan= binding.Ten.text.toString().ChuanHoaTen_2308()
        val  soLuong = binding.SoLuong.text.toString().trim().toIntOrNull()
        if(tenChuan.length !in 2..40){
            binding.Ten.setError("So Luong k hop le")
            return
        }
        if(soLuong == null || soLuong !in 1..9){
            binding.SoLuong.setError("So Luong phai la so nguyen 1 toi 9")
            return
        }
        demLuot++
        val maMoi = QuyTacPhieu_2308.taoMaPhieu_2308(demLuot)

        luotCuoi_2308 = Luotnhan(
            maLuot_2308 = maMoi,
            hoTen_2308 = tenChuan,
            soLuong
        )
        val model = luotCuoi_2308
        if(model !=null){
            binding.txtKetQua.text="Xin chao ${model.hoTen_2308} so luong ${model.SoLuong2308}"
            binding.txtMaLuot.text= model.maLuot_2308
        }

    }
    fun xoa_2308(){
        binding.Ten.text.clear()
        binding.SoLuong.text.clear()
        luotCuoi_2308=null
        binding.txtKetQua.text = ""
        binding.txtMaLuot.text = ""
    }
}