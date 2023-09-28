package com.example.lesson_6_homework_month_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson_6_homework_month_3.databinding.FragmentClassBinding

class ClassFragment : Fragment() {
    private lateinit var binding: FragmentClassBinding
    private lateinit var classList: ArrayList<String>
    private lateinit var classAdapter: ClassAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClassBinding   .inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        classAdapter = ClassAdapter(classList)
        binding.rvClass.adapter = classAdapter
    }


    private fun loadData() {
        classList = ArrayList()
        classList.add("Эрланова Сагида")
        classList.add("Ногойбаева Сезим")
        classList.add("Эрматова Адия")
        classList.add("Ырыскелдиева Каныкей")
        classList.add("Джолдошбаева Азиза")
        classList.add("Жуманазарова Анжелика")
        classList.add("Арстанбеков Тариэл")
        classList.add("Фиц Александра")
        classList.add("Алиев Бакберген")
        classList.add("Жусупов Мирланбек")
        classList.add("Иманалиев Эмир")
        classList.add("Ли Дарья")
        classList.add("Туруспеков Алмаз")
        classList.add("Сафиулин Анвар")
        classList.add("Сео Самуэль")
        classList.add("Айдиева Саадат")
        classList.add("Пан Артур")
        classList.add("Айдаров Азим")
        classList.add("Айдаралиев Мунарбек")
        classList.add("Темиралиева Сабина")
        classList.add("Мирлан кызы Айдана")
        classList.add("Маматов Элдос")
        classList.add("Карчин Алан")
        classList.add("Кадыров Бахтияр")

    }
}

